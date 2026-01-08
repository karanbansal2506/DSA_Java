package DSA.Search.Binary_Search;

// applicable for sorted array

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 1, 3, 5, 7, 9, 12, 15, 18, 21, 25};
        int target = -1 ;
        int ans = binarySearchAscending(arr, target);
        System.out.println(ans);
    }

    static int binarySearchAscending(int[] arr, int target){
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

    static int binarySearchDescending(int[] arr, int target){
        int start= 0;
        int end = arr.length -1;

        while(start<=end){
            // int mid = (start+end)/2 (end + start may exceed int range of number)
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                end = mid -1;
            } else if (target < arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
