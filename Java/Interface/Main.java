package Java.Interface;

interface BlackTV {
    void print();
}
interface ColorTV extends BlackTV {
    void colorprint();
}
class TV implements ColorTV {
    @Override
    public void print() {
        System.out.println("흑백티비");
    }
    
    @Override
    public void colorprint() {
        System.out.println("컬러티비");
    }
}
class Main {
    public static void main(String[] args) {
        ColorTV ctv = new TV();
        ctv.colorprint();
    }
}