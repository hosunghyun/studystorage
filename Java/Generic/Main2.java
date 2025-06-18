package Java.Generic;

class Util {
    // 제네릭 메서드 정의
    public <T> void prinT(T t) {
        System.out.println(t);
    }
}

// 제네릭 메서드 사용
public class Main2 {
    public static void main(String[] args) {
        Util util = new Util();
        
        util.prinT(3);
        util.prinT("Hello");
    }
}