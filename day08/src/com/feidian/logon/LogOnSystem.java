package com.feidian.logon;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LogOnSystem {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc=new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            switch (choice) {
                case 0:
                    System.out.println("欢迎来到学生管理系统");
                    System.out.println("请选择操作1.登录 2.注册 3.忘记密码");
                    choice=sc.nextInt();
                    break;
                case 1:
                    logOn(list);
                    choice=0;
                    break;
                case 2:
                    list = logIn(list);
                    choice=0;
                    break;
                case 3:
                    forgetPassword(list);
                    choice=0;
                    break;
            }
        }
    }
    public static void forgetPassword(ArrayList<User> list){
        System.out.println("请输入用户名");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int num=nameExist(list,name);
        if(num >= 0){
            System.out.println("请输入身份证号码");
            String cardId=sc.next();
            System.out.println("请输入电话号码");
            String phoneId=sc.next();
            if(cardId.equals(list.get(num).getCardId())&&phoneId.equals(list.get(num).getPhoneId())){
                String password="",password1="";
                while(true){
                    System.out.println("请输入密码");
                    password=sc.next();
                    System.out.println("请再次确认密码");
                    password1=sc.next();
                    if(password1.equals(password)){
                        System.out.println("Already");
                        break;
                    }else{
                        System.out.println("输入错误");
                    }
                }
                list.get(num).setPassWord(password);
                System.out.println("密码修改成功");
                return;
            }else{
                System.out.println("输入错误");
            }
        }else{
            System.out.println("未注册");
        }
    }
    public static String creatCode(){
        Random r=new Random();
        String str="";
        for (int i = 0; i < 4; i++) {
            int j=r.nextInt(26);
            if(j%2==0){
                str=str+(char)('a'+j);
            }else{
                str=str+(char)('A'+j);
            }
        }
        int i=r.nextInt(9);
        str=str+i;
        int j=r.nextInt(4);
        char[]ch=str.toCharArray();
        char temp=ch[4];
        ch[4]=ch[j];
        ch[j]=temp;
        return new String(ch);
    }
    public static int nameExist(ArrayList<User> list,String name){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static boolean logOn(ArrayList<User> list){
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        int num=nameExist(list, name);
        if(num>=0){
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入密码");
                String password=sc.next();
                while(true){
                    String code=creatCode();
                    System.out.println(code);
                    System.out.println("请输入验证码");
                    String getCode=sc.next();
                    if(code.equals(getCode)){
                        break;
                    }else{
                        System.out.println("输入错误");
                    }
                }
                if(list.get(num).getPassWord().equals(password)){
                    System.out.println("登录成功");
                    return true;
                }else{
                    System.out.println("密码错误");
                }
            }
            return false;
        }else{
            System.out.println("用户不存在，请先注册");
            return false;
        }
    }

    public static boolean isNumber(char ch) {
        if (ch > 47 && ch < 58) {
            return true;
        }
        return false;
    }

    public static boolean isLetter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }

    public static boolean nameLegal(String name) {
        int count = 0;
        if (name.length() < 3 || name.length() > 15) {
            return false;
        } else {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (isNumber(ch) == false && isLetter(ch) == false) {
                    return false;
                } else {
                    if (isLetter(ch))
                        count++;
                }
            }
        }
        if (count == 0)
            return false;
        else
            return true;
    }

    public static boolean cardIdLegal(String cardId) {
        if(cardId.length()==18){
            for (int i = 0; i < cardId.length()-1; i++) {
                if(isNumber(cardId.charAt(i))==false){
                    return false;
                }
            }
            char ch=cardId.charAt(17);
            if(ch=='X'||ch=='x'||isNumber(ch))
                return true;
            else
                return false;
        }else{
            return false;
        }
    }
public static boolean phoneIdLegal(String phoneId){
        if(phoneId.length()==11){
            if(phoneId.charAt(0)=='0'){
                return false;
            }else{
                for (int i = 0; i < phoneId.length(); i++) {
                    if(isNumber(phoneId.charAt(i))==false)
                        return false;
                }
                return true;
            }
        }
        return false;
}
    public static ArrayList<User> logIn(ArrayList<User> list) {
        System.out.println("请输入用户名(3-15位数字加字母，但不能是纯数字");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        while (nameLegal(name) == false) {
            System.out.println("不合法，请重新输入");
            name = sc.next();
        }
        System.out.println("请输入身份证号码(18位,前十七位必须是数字，最后一位可为x,X");
        String cardId = sc.next();
        while (cardIdLegal(cardId) == false) {
            System.out.println("不合法，请重新输入");
            cardId = sc.next();
        }
        System.out.println("请输入电话号码");
        String phoneId=sc.next();
        while (phoneIdLegal(phoneId)==false){
            System.out.println("不合法请重新输入");
            phoneId=sc.next();
        }
        String password="",password1="";
        while(true){
            System.out.println("请输入密码");
            password=sc.next();
            System.out.println("请再次确认密码");
            password1=sc.next();
            if(password1.equals(password)){
                System.out.println("Already");
                break;
            }else{
                System.out.println("输入错误");
            }
        }
        list.add(new User(cardId,name,phoneId,password));
        System.out.println("添加成功");
        return list;
    }
}
