package DSA.Sorting.Cyclic_Sort.Q1;
//  https://leetcode.com/problems/missing-number/

class Solution {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));

    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i<nums.length){
            if (nums[i]==nums.length || nums[i]==i){
                i++;
            } else {
                swap(nums, i , nums[i]);
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]==nums.length){
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}