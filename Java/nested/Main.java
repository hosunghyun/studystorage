package Java.nested;

public class Main {
    private String outerField = "Outer Field";

    class InnerClass {
        void accessOuter() {
            System.out.println("Accessing: " + outerField); // 바깥 클래스의 멤버에 접근
        }
    }

    public static void main(String[] args) {
        Main outer = new Main();
        Main.InnerClass inner = outer.new InnerClass();
        inner.accessOuter();
    }
}

