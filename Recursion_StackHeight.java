package Recursion_I;

public class Recursion_StackHeight {

    public static int CalcPower(int x, int n){

        if(n == 0) {            // Base Case 1
            return 1;
        }
        if(x == 0) {            // Base Case 2
            return 1;
        }

        int xPownm1 = CalcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;

    }

    public static void main(String[] args) {

        int x = 2 , n = 5;

       int ans =  CalcPower(x, n);
        System.out.println(ans);

    }

}
