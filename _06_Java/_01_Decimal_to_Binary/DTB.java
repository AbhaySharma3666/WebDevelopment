package _01_Decimal_to_Binary;

// To convert Decimal to binary we have 3 method according to time and space complexity
// 1. Using Arrays
// 2. Using Bitwise Operators
// 3. Using Math.pow() Function (Without using arrays)

public class DTB {
//    1. Using Array  ,  T.C = O(log n) and S.C = O(1000)
    static void decToBinaryArr(int n) {
        // array to store binary number
        int[] binaryNum = new int[1000];
        int i = 0;  // counter for binary array
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

//    2. By Bitwise Operator , T.C = O(1) and S.C = O(1)
    static void decToBinaryBit(int n){
        // Size of an integer is assumed to be 32 bits
        for (int i = 8; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }

//    3.Using Math.pow ,  T.C = O(log n) and S.C = O(1)
    static int decToBinaryMat(int N){
        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;

            // Count used to store exponent value
            cnt++;
        }

        return B_Number;
    }

//    4. best method
    static String decToBinary(int n){
        int remainder, quotient = n;
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        return binaryNum;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Decimal - " + n);

        System.out.print("Binary by array method - ");
        decToBinaryArr(n);

        System.out.println();

        System.out.print("Binary by bitwise method - ");
        decToBinaryBit(n);

        System.out.println();

        System.out.print("Binary by Math.pow method - ");
        System.out.println(decToBinaryMat(n));

        System.out.println();

        System.out.print("Binary by Math.pow method - ");
        System.out.println(decToBinary(n));
    }
}
