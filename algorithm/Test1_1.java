package algorithm;

public class Test1_1 {
    public static int findbyMax(int[] arr) {
            int max = arr[0];   // 비교하기 전에 배열의 첫번 째 값을 최대값으로 설정
    
            for(int num : arr) {    // 배열을 전부 한번 씩 비교
                if (max < num) {    // 최댓값보다 크면 변경
                    max = num;
                }
            }
    
            return max;
        }
        public static void main(String[] args) {
            // n개의 수로 구성된 배열에서 가장 큰 수를 찾는 알고리즘
            int[] arr = new int[] {10, 7, 11, 5, 13, 8};
    
            int maxnum = findbyMax(arr);
            System.out.println("최댓값 : " + maxnum);
    }
}