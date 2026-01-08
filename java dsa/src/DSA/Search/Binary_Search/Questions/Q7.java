package DSA.Search.Binary_Search.Questions;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Q7 {
    public static void main(String[] args) {

    }

    static int RBC(int[] nums, int target){
        if(nums.length<3){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==target){
                    return i;
                }
            }
            return -1;
        }
        int pivot = pivot(nums);
        if (pivot == -1){
            return binarySearchAscending(nums, target, 0, nums.length-1);
        }

        if (target < nums[0]){
            return binarySearchAscending(nums, target, pivot+1, nums.length-1);
        } else {
            return binarySearchAscending(nums, target, 0 ,pivot+1);
        }
    }

    static int binarySearchAscending(int[] arr, int target, int start, int end){

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

    static int pivot (int[] arr){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<arr[start]){
                end = mid-1;
            } else if (arr[mid]>arr[start]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        // kunal kushwaha's way
        int start = 0;
        int end = arr.length-1;
        //if(arr[start]<arr[end]){
        //    return -1;
        //}
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }



}
