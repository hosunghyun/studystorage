package Java.Generic;
// 제네릭 클래스 정의
class Notepad<T> {
    private T memo;
    
    public void setMemo(T memo) {
        this.memo = memo;
    }
    
    public T getMemo() {
        return memo;
    }
}

// 제네릭 클래스 사용
public class Main {
    public static void main(String[] args) {
        Notepad<String> stringBox = new Notepad<>();
        
        stringBox.setMemo("Hello");
        System.out.println(stringBox.getMemo()); // Hello
        
        Notepad<Integer> intBox = new Notepad<>();
        intBox.setMemo(123);
        System.out.println(intBox.getMemo()); // 123
    }
}