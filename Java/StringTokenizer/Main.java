package Java.StringTokenizer;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] number = new int[] {2, 1, 4, 3, 6, 5};
        Arrays.sort(number);    // 1, 2, 3, 4, 5, 6
        for(int n : number)
            System.out.println(n);
    }
}