package Java.nested;


class Outer {
    private static int num = 0;

    public static void local() {
        class Loca {
            public void add(int n) {
                num += n;
            }
            public int get() {
                return num;
            }
        }
        Loca loc = new Loca();
        loc.add(5);
        System.out.println(loc.get());
    }
}
class locals {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.local();
    }
}