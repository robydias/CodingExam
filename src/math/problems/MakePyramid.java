package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */

        for (int x= 0;x<6;x++) {

            for (int y = 5; y>= x; y--) {
                System.out.print(" ");
            }
            for (int z = 0; z <=x; z++) {
                System.out.print(" *");
            }
            System.out.println("");

        }
}
}
