import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 4;
        arr[1] = 9;
        arr[2] = 8;
        


        int[] arr1 = {4, 9, 8};


        // jagged array
        // ragged array
        int[][] twoDimArr = {
            {1, 2, 3}, 
            {4, 5, 6, 4},
            {7, 8, 9}
        };

        // for(int i = 0; i < twoDimArr.length; i++){
        //     for(int j = 0; j < twoDimArr[i].length; j++){
        //         System.out.println(twoDimArr[i][j]);
        //         // twoDimArr[i][j]
        //     }

        //     System.out.println();
        // }

        int[] firstArr = twoDimArr[0];
        int firstValue = firstArr[0];

        // System.out.println(firstValue);


        // int[] arr2 = {12, 3,4, 5};
        // for(int i = 0; i < arr2.length; i++){
        //     System.out.println(arr2[i]);
        // }

        // System.out.println(Arrays.toString(firstArr));


        String[][] scores = new String[2][4];

        scores[0][0] = "34";

        System.out.println(Arrays.toString(scores[0]));

        Scanner scnr = new Scanner(System.in);
        System.out.println("How big is the two d array");

        int size = scnr.nextInt();

        int[][] numbers = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.println("Give me the next value");
                numbers[i][j] = scnr.nextInt();
                
            }
        }

        for(int i = 0; i < numbers.length; i ++){
            System.out.println(Arrays.toString(numbers[i]));
        }



    }
}