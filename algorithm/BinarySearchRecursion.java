package algorithm;

class Recursion {
    public int bsr(int[] S, int x, int low, int high) {
        // 재귀의 종료 조건
        if(low > high) {
            return 0;
        }

        int mid = (low + high) / 2; // 중간 인덱스 계산

        if(S[mid] == x) {
            return mid;
        }
        else if (S[mid] > x) {
            return bsr(S, x, low, mid - 1);
        }
        else {
            return bsr(S, x, mid + 1, high);
        }
    }
}

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        
        int[] S = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};    // 배열 S
        int x = 5;  // 찾으려는 값 x
        
        int location = recursion.bsr(S, x, 0, (S.length - 1));
        System.out.println("x의 위치 : " + location);
    }
}
