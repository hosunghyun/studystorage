package algorithm;

class Test {
    public int[] findbySmall(int[] arr, int m) {
        int[] small = new int[m];
        
        return small;
    }
}
public class Test1_2 {
    public static void main(String[] args) {
        Test test = new Test();
        // n 개의 수로 구성된 리스트에서 m개의 가장 작은 수를 찾기
        int[] arr = new int[] {10, 7, 11, 5, 13, 8};
        int m = 3;

        int[] small = new int[m];

        small = test.findbySmall(arr, m);
    }
}
