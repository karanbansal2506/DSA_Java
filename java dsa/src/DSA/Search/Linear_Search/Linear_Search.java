package DSA.Search.Linear_Search;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {12,6,58,69,41,58,2,95,741,612,36,536,66,366,5,252,8,3};
        int target = 0;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        if (ans!= -1){
            System.out.println(nums[ans]);
        }
        int answer = linearSearch2(nums, target);
        System.out.println(answer);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int element : arr) {
            if (element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

}
