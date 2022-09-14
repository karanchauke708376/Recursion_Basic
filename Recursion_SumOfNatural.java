package Recursion_I;

public class Recursion_SumOfNatural {

    public static void  printSum(int i, int n, int sum){

        if (i == n) {           // Base Case

            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {

        printSum(1, 5, 0);

    }
}
