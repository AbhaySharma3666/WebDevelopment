package _08_Logic_Building;

import java.util.Scanner;

public class fibonaccie_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2=1, n3;
        System.out.print("Enter any position : ");
        int pos = sc.nextInt();
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
//        for (int c=1 ; c<=pos ; c++){
//            n3=n2+n1;
//            System.out.println(n3);
//            n1=n2;
//            n2=n3;
//        }

        while(pos != 0){
            n3=n2+n1;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            pos--;
        }
    }
}
