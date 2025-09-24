package _09_Array;

public class array_2d {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4,5,6,7},{8,9,10,11,12,13,14}};
        System.out.println(arr[1][3]);  // [row][column]
        int row = arr.length;
        int col = arr[0].length;
        int sum =0;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ;j++){
                System.out.print("  " + arr[i][j]);
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("\n===============");
        System.out.println("Sum of arr is "+ sum);

    }
}
