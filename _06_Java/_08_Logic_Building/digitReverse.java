package _08_Logic_Building;

import java.util.Scanner;

public class digitReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,rev=0;
        System.out.println("Enter any number : ");
        n= sc.nextInt();
        while(n!=0){
            r=n%10;
            rev = (rev*10)+r;
            n= n/10;
        }
        System.out.println("Digit reverse is : "+rev);
    }
}
