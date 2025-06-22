package Java.Generic;

import java.util.ArrayList;
import java.util.List;

public class wildcard {
    // 무제한 와일드카드
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    
    // 상한 제한 와일드카드
	public static void upList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }
    
    // 하한 제한 와일드카드
    public static void downList(List<? super Integer> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        
        printList(intList); // 1 2 3
        
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        
        upList(doubleList); // 1.1 2.2 3.3
        
        List<Number> numberList = new ArrayList<>();
        
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        downList(numberList);
    }
}