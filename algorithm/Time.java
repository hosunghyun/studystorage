package algorithm;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        
        int N = scr.nextInt();
        
        int count = 0;

        for(int i = 0; i < (N + 1); i++ ) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    if((String.valueOf(i) + String.valueOf(j) + String.valueOf(k)).contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
