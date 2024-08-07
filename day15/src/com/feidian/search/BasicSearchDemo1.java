package com.feidian.search;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int []arr={131,127,147,81,103,23,7,29};
        if(basicSearch(arr,81)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static boolean basicSearch(int arr[],int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
