package Recursion_I;

public class Recursion_FactorialNumbers {

    public static int printFact(int n) {
        if(n == 1 || n == 0) {    // Base Case
            return 1;
        }

        int fact_nm1 = printFact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }

    public static void main(String[] args) {

        int n = 5;

        int ans = printFact(n);

        System.out.println("Factorial Of "+n+" : "+ans);

    }

}
