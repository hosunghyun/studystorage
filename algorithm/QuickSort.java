package algorithm;

class Quick {
    public void quicksort(int[] S, int low, int high) {
        if (low < high) {
            // 파티션 인덱스를 구한다
            int pi = partition(S, low, high);

            // 파티션을 기준으로 왼쪽과 오른쪽 부분을 재귀적으로 정렬
            quicksort(S, low, pi - 1);  // 왼쪽 부분
            quicksort(S, pi + 1, high); // 오른쪽 부분
        }
    }
    public int partition(int[] S, int low, int high) {
        // 피벗을 배열의 마지막 원소로 선택
        int pivot = S[high];
        int i = low - 1; // 작은 원소들의 인덱스를 추적

        // low부터 high-1까지 순회하며, 피벗보다 작은 값을 왼쪽으로 모은다
        for (int j = low; j < high; j++) {
            if (S[j] < pivot) {
                i++;
                // i와 j의 값을 교환
                swap(S, i, j);
            }
        }

        // 마지막으로 피벗을 올바른 위치에 배치
        swap(S, i + 1, high);
        
        return i + 1;  // 피벗이 위치한 인덱스를 반환
    }

    public void swap(int[] S, int i, int j) {
        int temp = S[i];
        S[i] = S[j];
        S[j] = temp;
    }
}
public class QuickSort {
    public static void main(String[] args) {
        int[] S = new int[] { 10, 12, 20, 27, 13, 9, 22, 25 };
        
        Quick quick = new Quick();
        
        quick.quicksort(S, 0, S.length - 1);
        
        System.out.print("빠른 정렬 : ");
        for(int num : S) {
            System.out.print(num + " ");
        }
    }
}
