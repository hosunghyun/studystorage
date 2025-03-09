package algorithm;


class MergeSort {
    // 합병 정렬 함수
    public void mergesort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2; // 중간 인덱스 계산

            // 왼쪽 절반과 오른쪽 절반을 각각 재귀적으로 정렬
            mergesort(array, low, mid);
            mergesort(array, mid + 1, high);

            // 두 부분 배열을 합병
            merge(array, low, mid, high);
        }
    }

    // 두 배열을 병합하는 함수
    public void merge(int[] array, int low, int mid, int high) {
        // 임시 배열 생성
        int[] temp = new int[high - low + 1];
        
        int i = low;   // 왼쪽 부분 배열의 시작 인덱스
        int j = mid + 1;  // 오른쪽 부분 배열의 시작 인덱스
        int k = 0;  // temp 배열의 인덱스

        // 두 배열을 비교하면서 temp 배열에 정렬된 순서대로 삽입
        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } 
            else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        // 왼쪽 배열의 남은 원소들 삽입
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        // 오른쪽 배열의 남은 원소들 삽입
        while (j <= high) {
            temp[k] = array[j];
            j++;
            k++;
        }

        // 임시 배열의 내용을 원래 배열에 복사
        for (i = 0; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }
}

public class MergeSortTwo {
    public static void main(String[] args) {
        int[] S = new int[] { 10, 12, 20, 27, 13, 9, 22, 25 };
        MergeSort merge = new MergeSort();
        
        // 배열 인덱스 범위를 올바르게 지정 (0부터 7까지)
        merge.mergesort(S, 0, (S.length - 1));
        System.out.print("정렬 : ");
        
        for(int num : S) {
            System.out.print(num + " ");
        }
    }
}
