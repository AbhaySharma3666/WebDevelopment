<<<<<<< HEAD
package _08_Logic_Building;

import java.util.Scanner;

public class armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int st = num;
        int count = 0, r;

        while(num!=0){
            r= num%10;
            num = num/10;
            count++;
        }
        num = st; r=0;
        int sum=0;
        while(num!=0){
            r=num%10;
            sum = (int) (sum + (Math.pow(r,count)));
            num = num/10;
        }
        if (st == sum) System.out.println("Given number is an Armstrong no.");
        else System.out.println("Given number is not an Armstrong no.");
    }
}
=======
package _08_Logic_Building;

import java.util.Scanner;

public class armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int st = num;
        int count = 0, r;

        while(num!=0){
            r= num%10;
            num = num/10;
            count++;
        }
        num = st; r=0;
        int sum=0;
        while(num!=0){
            r=num%10;
            sum = (int) (sum + (Math.pow(r,count)));
            num = num/10;
        }
        if (st == sum) System.out.println("Given number is an Armstrong no.");
        else System.out.println("Given number is not an Armstrong no.");
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
