package DSA.Search.Linear_Search;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {
                {21,36,96,4},
                {3,63,41,2,25,663},
                {1,2,963},
                {255,22}
        };
        int target = 13;
        int[] ans =search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
    }

    static int[] search(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
