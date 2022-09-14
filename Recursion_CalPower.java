package Recursion_I;

public class Recursion_CalPower {

    public static int print_Power(int a , int b) {

        if(b == 0) {            // Base Case 1
            return 1;
        }

        if(a == 0) {            // Base Case 2
            return 0;
        }

        return a * print_Power(a, b-1);

    }

    public static void main(String[] args) {

        System.out.println(print_Power(2 , 5));

    }

}
