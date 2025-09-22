package algorithm;

class FibonacciSequences {
    public int fibonaccisequence(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        
        return fibonaccisequence(n - 1) + fibonaccisequence(n - 2);
    }
}
public class Main {
    public static void main(String[] args) {
        FibonacciSequences fibonacciSequences = new FibonacciSequences();
        
        int F = 7;

        int location = fibonacciSequences.fibonaccisequence(F);

        System.out.println("result : " + location);
    }
}
