package _08_Logic_Building;

import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,sum=0;
        System.out.println("Enter any number : ");
        n= sc.nextInt();
        while(n!=0){
            r=n%10;
            sum += r;
            n= n/10;
        }
        System.out.println("Digit sum is : "+sum);
    }
}
