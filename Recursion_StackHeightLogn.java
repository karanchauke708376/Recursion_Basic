package Recursion_I;

public class Recursion_StackHeightLogn {

    public static int calcPower(int x, int n) {

        if(n == 0) {        // Base Case  1
            return 1;
        }
        if(x == 0) {       // // Base Case 2
            return 0;
        }

        // if n is Even
        if(n % 2 == 0) {
              // Even Number Calculate
           return calcPower(x, n/2) * calcPower(x, n/2);
        } else {
            // Odd Number Calculate
            return calcPower(x, n/2) * calcPower(x, n/2) * x;

        }

    }

    public static void main(String[] args) {

        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println("Stack Height Logn Is : " + ans);

    }

}
