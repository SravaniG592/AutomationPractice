package day1;

import java.util.Scanner;
public class RectangleArea {

    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter length of rectangle :");
int num1 = sc.nextInt();

System.out.println("Enter breadth of rectangle :");
int num2 = sc.nextInt();

RectangleArea ra= new RectangleArea();
ra.RectangleArea(num1,num2);
ra.RectanglePerimeter(num1,num2);


    }

    public void RectangleArea(int l, int b){
        float area= l *b;
        System.out.println("Area of rectangle"+ area);

    }

    public void RectanglePerimeter(int l, int b){
        float perimeter= (2*l) + (2*b);
        System.out.println("Perimeter of rectangle"+ perimeter);
    }

}
