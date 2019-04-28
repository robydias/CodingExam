package math.problems;

import java.sql.SQLOutput;

public class Factorial {
    public static int factorial(int n) {
    if (n == 0)
        return 1;
    else
        return n*factorial(n-1);
}

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int number =1;
        for(int i=1; i<6; i++){

            number = number * i;
        }
        System.out.println("Factorial of 5 :"+number);
        System.out.println("=========================");

       System.out.println( "factorial of 5"+factorial(5));
    }
}
