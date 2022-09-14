package Recursion_I;

public class Recursion_NTo1 {

    public static void printNumb(int n) {

        if(n == 0) {      // Base Case
            return;
        }

        System.out.println(n);
        printNumb(n-1);

    }

    public static void main(String[] args) {

        int n = 5;
        printNumb(n);

    }

}
