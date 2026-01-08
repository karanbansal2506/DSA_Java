package DSA.Search.Binary_Search.Questions;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {2,3,6,9,9,9,9,9};
        int target = 9;
        int[] ans = Answer(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Answer (int[] nums, int target){
        int x =Search(nums, target);
        if (x == -1){
            return new int[]{-1,-1};
        }
        int i = x;

        while ( i>0 && nums[i-1]==nums[x] ){
            i--;
        }
        int j = x;
        while (j<nums.length-1 && nums[j+1]==nums[x] ){
            j++;
        }
        return new int[]{i,j};
    }

    static int Search (int[] arr, int target) {
        int start= 0;
        int end = arr.length -1;

        while(start<=end){
            // int mid = (start+end)/2 (end + start may exceed int range of number)
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // other way

    static int[] searchRange(int[]  nums, int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] =search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean findStart){
        int ans= -1;
        int start= 0;
        int end = nums.length -1;

        while(start<=end){
            // int mid = (start+end)/2 (end + start may exceed int range of number)
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            } else {
                ans = mid;
                if (findStart){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
