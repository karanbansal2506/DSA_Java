package DSA.Search.Linear_Search;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {12,6,58,69,41,58,2,95,741,612,36,536,66,366,5,252,8,3, -98};
        System.out.println(min(nums));
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}
