package Java.CollectionFramework;
import java.util.HashSet;

public class haset {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> set = new HashSet<>();
        
        // 요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복된 요소
        
        // 출력
        System.out.println(set); // 출력 순서는 보장되지 않음
        
        // 요소 제거
        set.remove("Banana");
        
        // 특정 요소 존재 여부 확인
        boolean hasApple = set.contains("Apple"); // true
        boolean hasBanana = set.contains("Banana"); // false
        
        // 전체 요소 출력
        for (String fruit : set) {
            System.out.println(fruit);
        }
        
        // 사이즈 확인
        System.out.println("Size: " + set.size());
    }
}
