package DSA.Search.Binary_Search.Questions;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 1, 3, 5, 7, 9, 12, 15, 18, 21, 25};
        int target = 10;
        int ans = floor(arr, target);
        System.out.println(arr[ans]);
    }

    static int ceiling(int[] arr, int target){
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

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

        return start;
    }

    static int floor(int[] arr, int target){
        if (target<arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

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

        return end;
    }
}
