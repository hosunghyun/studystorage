package algorithm;

class BinarySearchs {
    public int search(int[] S, int F) {  // 메서드 이름을 소문자로 시작
        int low = 0;
        int high = S.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // 중간값 계산 (mid 선언 시 타입을 명시)
            
            if (S[mid] == F) {
                return mid;  // 목표 값이 일치하면 인덱스 반환
            }
            else if (S[mid] > F) {  // 목표 값이 중간 값보다 작으면 왼쪽 부분 탐색
                high = mid - 1;
            }
            else {  // 목표 값이 중간 값보다 크면 오른쪽 부분 탐색
                low = mid + 1;
            }
        }

        return -1;  // 목표 값이 배열에 없을 경우 -1 반환
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearchs binarySearch = new BinarySearchs();
        int[] S = new int[] {5, 7, 8, 10, 11, 13};  // 정렬된 배열 S
        int F = 8;  // 찾을 값

        int location = binarySearch.search(S, F);  // 배열 S에서 값 F를 찾기

        System.out.println("result : " + location);  // 찾은 값의 인덱스를 출력
    }
}
