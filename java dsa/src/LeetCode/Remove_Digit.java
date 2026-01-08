package LeetCode;
// https://leetcode.com/contest/weekly-contest-291/problems/remove-digit-from-number-to-maximize-result/
public class Remove_Digit {
    public static void main(String[] args) {
        String s = "133235";
        char digit = '3';
        System.out.println(fn(s, digit, fns(s, digit)));
    }

    static int fns(String number, char digit){
        int y = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit){
                y++;
            }
        }
        return y;
    }

    static String fn(String number, char digit, int y){
        String ans = "0";

        for (int j = 1; j <=y ; j++) {
            int x = 0;
            String str = "";
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == digit){
                    x++;
                    if (x == j){
                        continue;
                    }
                }
                str = str + number.charAt(i);
            }
            if (str.compareTo(ans) > 0){
                ans = str;
            }
        }

        return ans;
    }
}
