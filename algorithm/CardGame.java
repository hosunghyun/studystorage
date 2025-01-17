package algorithm;

import java.util.Arrays;

public class CardGame {
    public static void main(String[] args) {
        int[][] cards = new int[][] {
            {7, 3, 1, 8},
            {3, 3, 3, 4}
        };
        
        int result = 0;

        for (int[] s : cards) {
            // 햔제 헹에서 가장 작은 수 찾기
            int minvalue = Arrays.stream(s).min().getAsInt();
            
            // 가장 작은 수 들 중에서 가장 큰 수 찾기
            result = (result < minvalue) ? minvalue : result; 
        }
        System.out.println(result);
    }
}
