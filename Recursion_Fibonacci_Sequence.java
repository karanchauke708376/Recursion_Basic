package Recursion_I;

public class Recursion_Fibonacci_Sequence {

    public static void print_Fibo(int a , int b , int n) {

        if(n == 0) {     // Base Case

            return;
        }

        int c = a + b ;
        System.out.print(c+" ");
        print_Fibo(b, c, n-1);
    }

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        int n = 7;
        print_Fibo(a, b, n-2);
    }

}
