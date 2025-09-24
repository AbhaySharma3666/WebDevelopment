<<<<<<< HEAD
package _09_Array;

import java.util.Scanner;

public class array_2d_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row of array :- ");
        int row = sc.nextInt();
        System.out.println("Enter column of array :- ");
        int col = sc.nextInt();
        int [][] arr = new int [row][col];
        System.out.println("Enter "+(row*col)+" number :- ");
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum=0;
        System.out.println("Matrix is : -");
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+arr[i][j]);
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of arr : " + sum);
    }
}
=======
package _09_Array;

import java.util.Scanner;

public class array_2d_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row of array :- ");
        int row = sc.nextInt();
        System.out.println("Enter column of array :- ");
        int col = sc.nextInt();
        int [][] arr = new int [row][col];
        System.out.println("Enter "+(row*col)+" number :- ");
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum=0;
        System.out.println("Matrix is : -");
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+arr[i][j]);
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of arr : " + sum);
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
