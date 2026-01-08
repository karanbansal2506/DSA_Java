package DSA.Search.Binary_Search.Questions;

// infinite array

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {2,10,22,36,58,74,89,120,165};
        int target = 36;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target>arr[end]){
            int newStart = end +1;

            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
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
}
