package day1;

public class Divisible {

    public static void main(String args[]) {


        for (int n = 0; n < 100; n++) {

            if (n % 3 == 0) {

                System.out.println("Number is divisble by 3 "+n);
            }
            if (n % 5 == 0) {
                System.out.println("NUmber divisble by 5 "+n);
            }
            if (n % 3 == 0 & n % 5 == 0) {

                System.out.println("Number is divisble by 3 and 5"+n);
            }

        }
    }
}