package Java.CollectionFramework;
import java.util.ArrayList;

public class Arrlst {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add(1, "Orange"); // 인덱스 1에 요소 삽입
        
        System.out.println(list); // 출력: [Apple, Orange, Banana]
        
        list.remove("Orange");
        
        list.remove(0); // 인덱스 0의 요소 제거
        
        System.out.println(list); // 출력: [Banana]
        
        String fruit = list.get(0); // 요소 접근
        
        System.out.println(fruit); // 출력: Banana
        
        list.set(0, "Mango"); // 요소 수정
        
        System.out.println(list); // 출력: [Mango]
    }
}
