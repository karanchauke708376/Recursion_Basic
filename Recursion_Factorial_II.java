package Recursion_I;

public class Recursion_Factorial_II {

    public static int print_Fact(int n) {

        if(n == 0) {
            return 1;
        }

        return n * print_Fact(n-1);

    }

    public static void main(String[] args) {

        System.out.println("Factorial Of 5 Is : " + print_Fact(5));

    }

}
