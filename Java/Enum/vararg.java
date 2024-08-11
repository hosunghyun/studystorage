package Java.Enum;

public class vararg {
    
    // 가변인자를 사용하는 메서드
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // 가변인자에 여러 개의 인자 전달
        printNumbers(1, 2, 3, 4, 5);

        // 가변인자에 배열을 전달
        int[] nums = {10, 20, 30};
        printNumbers(nums);
    }
}
