package Recursion_I;

public class Recursion_Fibonacci_II {

    static int a = 0, b = 1, c = 0;

    public static void print_Fibo(int count) {

        if(count > 0) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(" " + c);
            print_Fibo(count-1);
        }
    }

    public static void main(String[] args) {

        int count = 10;
        System.out.print(a+" "+b);
        print_Fibo(count-2);

    }

}
