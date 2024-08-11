package Java.Lambda;

// 원래코드
interface Print {
    void print(String s);
}
class Printer implements Print {
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
class Main {
    public static void main(String[] args) {
        Print p = new Printer();
        p.print("Hello World");
    }
}

// 익명 클래스
interface Print {
    void print(String s);
}

class Main {
    public static void main(String[] args) {
        Print p = new Print() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };

        p.print("Hello World");
    }
}

// 람다
