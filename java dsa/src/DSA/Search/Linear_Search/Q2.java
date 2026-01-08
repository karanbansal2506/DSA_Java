package DSA.Search.Linear_Search;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = {12,6,58,69,41,58,2,95,741,612,36,536,66,366,5,252,8,3};
        int target = 36;
        int ans = linearSearch(nums, target,2,  9);
        System.out.println(ans);
        if (ans!= -1){
            System.out.println(nums[ans]);
        }
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
