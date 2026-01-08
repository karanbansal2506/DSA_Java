package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Plates_Between_Candles {
    public static void main(String[] args) {
        String s = "***|**|*****|**||**|*";
        int[][] queries = {
                {1, 17},
                {4, 5},
                {14, 17},
                {5, 11},
                {15, 16}
        };
        int[] x = platesBetweenCandles(s, queries);
        System.out.println(Arrays.toString(x));

    }

    static int[] platesBetweenCandles(String s, int[][] queries){
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ans =0;
            while(s.charAt(queries[i][0]) != '|'){
                queries[i][0]++;
            }
            while(s.charAt(queries[i][1]) != '|'){
                queries[i][0]--;
            }
            for (int a =queries[i][0] ; a < queries[i][0]; a++) {
                if (s.charAt(a) == '*'){
                    ans++;
                }
            }
            answer[i] = ans;
        }
        return answer;
    }
}
