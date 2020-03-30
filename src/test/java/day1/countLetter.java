//package day1;
//import java.util.Scanner;
//import java.lang.Character;
//public class countLetter {
//
//    public static void main(String args[]){
//Scanner sc= new Scanner(System.in);
//System.out.println("/n Enter string :");
//
//String test = sc.nextLine();
//countLetter cl = new countLetter();
//cl.count(test);
//
//    }
//
//public void count(String s){
//
//        char[] ch = s.toCharArray();
//        int letter=0;
//        int space= 0;
//        int digit=0;
//        int other=0;
//
//        for (int i =0; i< s.length(); i++){
//            if(ch.isLetter(ch[i])){
//                letter++;
//            }
//             if(ch.isSpace(ch[i])){
//                 space++;
//             }
//        if(ch.isDigit(ch[i])){
//            digit++;
//        }
//        else
//            other++;
//        }
// System.out.println("letter :" +letter);
//        System.out.println("Space :"+space);
//        System.out.println("Digit: "+digit);
//        System.out.println("Other :"+other);
//}
//}
