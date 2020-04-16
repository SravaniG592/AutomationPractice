package practice2;

public class MethodOverloadingExample {

    private int x;

    MethodOverloadingExample(){
        System.out.println("Constructor called ");
        x=5;
    }

    public static void main(String args[])
    {
        MethodOverloadingExample mo= new MethodOverloadingExample();
        System.out.println("Value of x="+ mo.x);
    }


}
