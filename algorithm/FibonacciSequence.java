package algorithm;

class FibonacciSequences {
    // 재귀 방식
    public int Recursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        return Recursion(n - 1) + Recursion(n - 2);
    }
    
    // 반복문 방식
    public int Iterative(int n) {
        if (n == 0) {
            return 0;
        } 
        else if (n == 1) {
            return 1;
        }
        
        int prev = 0;  // 이전 피보나치 수
        int curr = 1;  // 현재 피보나치 수
        
        for (int i = 2; i <= n; i++) {  // n번째 피보나치 수를 계산
            int next = prev + curr;  // 다음 피보나치 수
            prev = curr;  // prev를 현재 값으로 갱신
            curr = next;  // curr를 다음 값으로 갱신
        }
        
        return curr;  // 최종적으로 n번째 피보나치 수 반환
    }
}

public class FibonacciSequence {
    public static void main(String[] args) {
        FibonacciSequences fibonacciSequences = new FibonacciSequences();
        
        int F = 8;  // 7번째 피보나치 수를 구하자

        // 재귀 방식으로 계산
        int location = fibonacciSequences.Recursion(F);
        
        System.out.println("재귀 방식 결과: " + location);
        
        // 반복문 방식으로 계산
        location = fibonacciSequences.Iterative(F);
        
        System.out.println("반복문 방식 결과: " + location);
    }
}
