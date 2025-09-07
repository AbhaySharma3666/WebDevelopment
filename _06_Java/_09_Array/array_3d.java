package _09_Array;

public class array_3d  {
    public static void main(String[] args) {
        int  [][][] arr = {
                {{10,20,30,40}},
                {{11,12,13},{23,54,6,7}},
                {{5,6,7,44,7,21}}
        };
        System.out.println("total length of arr " + arr.length);
        System.out.println("length at arr[0] : "+ arr[0].length);
        System.out.println("length at arr[1] : "+arr[1].length);
        System.out.println("length at arr[2] : "+arr[2].length);
        System.out.println("length at arr[0][0] : "+arr[0][0].length);
        System.out.println("length at arr[1][0] : "+arr[1][0].length);
        System.out.println("length at arr[1][1] : "+arr[1][1].length);
        System.out.println("length at arr[2][0] : "+arr[2][0].length);


        int [][][] x = {
                {{10,20,30,40},{5,6},{99}},
                {{11,12,13},{45,46}},
                {{50,51,52,53}},
                {{54,55},{56,57,58}}
        };

        for (int i=0 ; i<x.length ; i++){
            for (int j=0 ; j<x[i].length ; j++){
                for (int k=0; k<x[i][j].length ; k++){
                    System.out.print("    "+x[i][j][k]);
                }
            }
            System.out.println();
        }
    }
}
