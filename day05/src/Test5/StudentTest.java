package Test5;

public class StudentTest {
    public static void main(String[] args) {
        Student []students=new Student[3];
        Student student=new Student(1001,"张三",18);
        students[0]=student;
        Student student1=new Student(1002,"李四",19);
        int i=0;
        while(students[i]!=null&&students[i].getId()!=student1.getId()&&i<students.length){
            i++;
        }
        if(i>=students.length){
            System.out.println("数组已满.");
        }else if(students[i]==null){
            students[i]=student1;
            System.out.println("成功添加");
        }else{
            System.out.println("id重复.");
        }
    }
}
