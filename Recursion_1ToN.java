package Recursion_I;

public class Recursion_1ToN {

    public static void printNumb(int n) {

        if(n == 6) {     // Base Case
            return;
        }

            System.out.println(n);
            printNumb(n+1);

    }

    public static void main(String[] args) {

        int n = 0;
        printNumb(n);

    }

}
