package _10_Pattern;

public class pattern_que {
    public static void parttern1() {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void parttern2() {
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void parttern3() {
        /*
         1
         2 3
         4 5 6
         7 8 9 10
         */
        int k=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void parttern4() {
        /*
         *                 *
         * *             * *
         * * *         * * *
         * * * *     * * * *
         * * * * * * * * * *
         */
        int rows = 5; // Number of rows in the pattern

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print stars for the left half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }


            if (i < rows) {
                for (int k = 1; k <= 2 * (rows - i); k++) {
                    System.out.print(" ");
                }
            }

            // Print stars for the right half (if not the last row)
            if (i <= rows) {
                for (int l = 1; l <= i; l++) {
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to the next line
        }


    }



    public static void main(String[] args) {
        parttern1();
        System.out.println();
        parttern2();
        System.out.println();
        parttern3();
        System.out.println();
        parttern4();
    }
}
