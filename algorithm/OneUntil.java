package algorithm;

import java.util.Scanner;

public class OneUntil {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        System.out.println("입력값:");
        String NK = scr.nextLine();
        String[] data = NK.split(" ");
        int N = Integer.parseInt(data[0]);
        int K = Integer.parseInt(data[1]);
        
        int cnt = 0;

        while (N != 1) {
            if(N % K != 0) {
                N--;
                cnt++;
            }
            else {
                N /= K;
                cnt++;
            }
        }
        System.out.println("출력 : " + cnt);
    }
}