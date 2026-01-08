package JavaPractice;

import java.util.Arrays;

public class Function{
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};

//        arr= {1,5,6,9,8};  JavaPractice.Array initializer is not allowed here

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums  = new int[]{2, 56, 36, 32, 52}; // if you make a change to the object via this ref variable, same object will be changed
    }
}