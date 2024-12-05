package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BIgNum {
    public static void main(String[] args) {
        String NMK = new String("5 8 3");
        String N = new String("2 4 5 5 6");

        String[] arr = NMK.split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);

        String[] arr2 = N.split(" ");
        List<Integer> data = new ArrayList<>();
        
        for(String s : arr2) {
            data.add(Integer.parseInt(s));
        }

        Collections.sort(data);

        int result = 0;
        int first = data.get(n - 1);    // 가장 큰 수
        int second = data.get(n - 2);   // 두 번째로 큰 수

        while (true) {
            for(int i = 0; i < k; i++) {    // 가장 큰 수를 k 번 더하기
                if(m == 0) {
                    break;  // m이 0이라면 반복문 탈출
                }
                result += first;
                System.out.print("반복문 안 : " + result);
                m--;
                System.out.println("반복문 안 : " + m);
            }
            if(m == 0) {
                break;
            }
            result += second;
            System.out.print("반복문 밖 : " + result);
            m--;
            System.out.println("반복문 밖 : " + m);
        }

        System.out.println(result);
    }
}
