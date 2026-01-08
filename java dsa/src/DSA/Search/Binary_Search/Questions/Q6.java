package DSA.Search.Binary_Search.Questions;

public class Q6 {
    public static void main(String[] args) {

    }

    static int SearchInMountainArray(int[] MountainArr, int target){
        int peak = peakIndexInMountaininArray(MountainArr);
        int ans1 = OrderAgnosticBS(MountainArr, target, 0, peak);
        if (ans1!=-1){
            return ans1;
        }
        int ans2 = OrderAgnosticBS(MountainArr, target, peak, MountainArr.length-1);
        return ans2;
    }

    static int peakIndexInMountaininArray(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start<end){
            int mid = start + (end-start)/2;

            if(nums[mid+1] < nums[mid]){
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return start; // return start or end , both are equal
    }


    static int binarySearch(int[] arr, int target, int start, int end){
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

    static int OrderAgnosticBS(int[] arr, int target, int start, int end){


        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            // int mid = (start+end)/2 (end + start may exceed int range of number)
            int mid = start + (end-start)/2;

            if (target== arr[mid]){
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
