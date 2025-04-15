public class Test {
    public static void main(String[] args) {
        boolean answer = true;
        int x = 11;
        int y = x;
        int a = 0;
        
        while(y > 0) {
            a += y % 10;
            y = y / 10;
        }
        
        if(x % a == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        System.out.println(answer);
    }   
}
