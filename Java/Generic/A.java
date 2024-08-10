package Java.Generic;

import java.util.Arrays;
import java.util.List;

public class A {
    public static <T> void a(List<T> lst) {
    for(T t : lst) {
        System.out.println(t);
    }
}
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        a(arr);
    }
}
