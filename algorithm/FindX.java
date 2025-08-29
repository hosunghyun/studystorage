import java.util.ArrayList;
import java.util.List;

public class FindX {
    public static void main(String[] args) {
        String str = "oxooxoxxox";
        
        List<Integer> answer = new ArrayList<>();
        
        for(String s : str.split("x")) {
            if(!s.contains("x"))
                answer.add(s.length());
        }
        
    }
}
