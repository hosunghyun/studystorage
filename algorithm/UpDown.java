import java.util.Arrays;

public class UpDown {
    public static void main(String[] args) {
        int[] n = {15, 27, 12};
        
        for(int i : n) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        Arrays.sort(n);
        
        for(int i : n) {
            System.out.print(i + " ");
        }
    }
}
