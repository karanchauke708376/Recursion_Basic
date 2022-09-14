package Recursion_I;

public class Recursion_SumOfNatural_II {

    public static int print_SumNatural(int n) {

        if(n == 1) {
            return 1;
        }

        return n + print_SumNatural(n-1);

    }

    public static void main(String[] args) {

        System.out.println(print_SumNatural(5));

    }

}
