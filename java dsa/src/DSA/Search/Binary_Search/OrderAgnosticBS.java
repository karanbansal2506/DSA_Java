package DSA.Search.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-18, -12, 0, 1, 3, 5, 7, 9, 12, 15, 18, 21, 25};
        int[] arr = {25, 21, 18, 15, 12, 9, 7, 5, 3, 1};
        //int[] arr = {3,3,3,3,3,3,3,3,3,3};
        int target = 3;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int target){
        int start= 0;
        int end = arr.length -1;

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
