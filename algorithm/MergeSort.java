package algorithm;

import java.util.Arrays;

class Merge {
    public void sort(int[] S) {
        if(S.length <= 1) { // 1. 배열의 길이가 1 이하인 경우 정렬 완료
            return;
        }

        // 2. 배열을 두 부분으로 나눔
        int mid = S.length / 2;
        
        // 배열을 절반으로 나누기
        int[] left = Arrays.copyOfRange(S, 0, mid);
        int[] right = Arrays.copyOfRange(S, mid, S.length);

        // 재귀적으로 정렬
        sort(left);
        sort(right);

        // 정렬된 배열을 병합
        merge(S, left, right);
    }

    public void merge(int[] S, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // left와 right 배열의 원소를 비교하여 S 채움
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                S[k++] = left[i++];
            } 
            else {
                S[k++] = right[j++];
            }
        }
        
        // left 배열에 남아있는 원소가 있다면 채움
        while (i < left.length) {
            S[k++] = left[i++];
        }
        
        // right 배열에 남아있는 원소가 있다면 채움
        while (j < right.length) {
            S[k++] = right[j++];
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] S = new int[] { 10, 12, 20, 27, 13, 9, 22, 25 };
        Merge merge = new Merge();
        
        merge.sort(S);

        System.out.print("합병 정렬 : ");
        
        for (int s : S) {
            System.out.print(s + " ");
        }
    }
}
