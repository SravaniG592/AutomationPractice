//import java.util.Scanner;
//package practice2;
//
//public class Student {
//
//    String name;
//    String stu_id;
//    int score;
//
//    public Student()
//    {
//        this(" "," ",0);
//    }
//
//    public Student(String initName, String initID,int initScore)
//    {
//        name= initName;
//        stu_id= initID;
//        score= initScore;
//    }
//
//    public class Main
//    {
//        public static void main(String args[])
//        {
//          Scanner in = new Scanner(System.in);
//          System.out.println("Input number of Students :");
//          int n = Integer.parseInt(in.nextLine().trim());
//          System.out.println("Input Student name,ID,Score :");
//          Student stu = new Student();
//          Student max= new Student();
//          Student min = new Student(" "," ",100);
//
//          for(int i =0; i< n ; i++)
//          {
//              stu.name= in.next();
//              stu.stu_id=in.next();
//              stu.score=in.nextInt();
//              if(max.score < stu.score){
//                  max.name=stu.name;
//                  max.stu_id= stu.stu_id;
//                  max.score
//
//              }
//
//
//
//          }
//        }
//    }
//
//}
