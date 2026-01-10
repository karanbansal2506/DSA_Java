package DSA.Sorting.Cyclic_Sort;

import java.util.Arrays;
// work for continuous number mainly

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){        // I think (i != correct) will also work
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
