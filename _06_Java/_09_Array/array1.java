package _09_Array;

public class array1 {
    public static void main(String[] args) {
        // creating array
        int [] arr = {1,2,3,4,5,5,6,7,3};
        // we use enhance for loop for print
        for (int val :arr){
            System.out.print(val + " ");
        }

        System.out.println();
        // simple for loop
        for (int i=0;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Length of arr is "+ arr.length);

        double [] d = {'a',10.23f,34.2,23};
        for (double val:d){
            System.out.print(val + " ");
        }
    }
}
