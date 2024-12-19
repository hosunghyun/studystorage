public class HeapSort {

    // 힙 정렬 메서드
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 1. 배열을 최대 힙으로 변환
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. 힙에서 요소를 하나씩 추출하여 정렬
        for (int i = n - 1; i > 0; i--) {
            // 루트(가장 큰 값)를 끝으로 이동
            swap(arr, 0, i);

            // 힙 크기를 줄이고 다시 힙 속성을 유지
            heapify(arr, i, 0);
        }
    }

    // 힙 속성을 유지하는 메서드
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // 루트 노드
        int left = 2 * i + 1; // 왼쪽 자식 노드
        int right = 2 * i + 2; // 오른쪽 자식 노드

        // 왼쪽 자식이 루트보다 크면 largest 갱신
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 오른쪽 자식이 largest보다 크면 largest 갱신
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // largest가 루트가 아니면 교환하고 재귀적으로 heapify 수행
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    // 두 요소를 교환하는 메서드
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 배열 출력 메서드
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 메인 메서드
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        System.out.println("정렬 전 배열:");
        printArray(arr);

        heapSort(arr); // 힙 정렬 수행

        System.out.println("정렬 후 배열:");
        printArray(arr);
    }
}
