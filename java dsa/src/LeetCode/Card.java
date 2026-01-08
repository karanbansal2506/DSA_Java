package LeetCode;
//https://leetcode.com/contest/weekly-contest-291/problems/minimum-consecutive-cards-to-pick-up/description/
public class Card {
    public static void main(String[] args) {
        int[] nums = {3,4,2,3,4,7};
        System.out.println(ans(nums));
    }

    static int ans(int [] arr){
        int ans = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ans > fn(arr, arr[i])){
                ans = fn(arr, arr[i]);
                answer = arr[i];
            }
        }
        if (ans > 100000){
            return -1;
        }
        return ans+1;
    }

    static int fn (int[] arr, int digit){
        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MAX_VALUE;
        int y = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit){
                if (y == 1){
                    x1 = i;
                    y++;
                } else if (y == 2) {
                    x2 = i;
                }
            }
        }
        return x2-x1;
    }
}
