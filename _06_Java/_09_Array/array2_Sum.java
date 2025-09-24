package _09_Array;

public class array2_Sum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,6,7,3};
        // we use enhance for loop for print
        int sum =0;
        for (int val :arr){
            System.out.print(val + " ");
            sum += val;
        }
        System.out.println();
        System.out.println("Sum of arrary is " + sum);
    }
}
