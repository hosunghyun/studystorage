package Java.CollectionFramework;

import java.util.TreeSet;

public class trset {
    public static void main(String[] args) {
        // TreeSet 생성
        TreeSet<String> set = new TreeSet<>();
        
        // 요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복된 요소, 추가되지 않음
        
        // 출력
        System.out.println(set); // [Apple, Banana, Cherry]
        
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
        
        // 정렬된 집합에서 특정 범위의 요소 조회
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());
        System.out.println("HeadSet (before 'Cherry'): " + set.headSet("Cherry"));
        System.out.println("TailSet (from 'Apple'): " + set.tailSet("Apple"));
    }
}
