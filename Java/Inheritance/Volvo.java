package Java.Inheritance;

public class Volvo extends Car {
    private int oil;    // 기름의 양

    // 생성자
    public Volvo() {
        super();
        oil = 0;
    }
    public Volvo(String name, int speed, int oil) {
        super(name, speed);
        this.oil = oil;
    }

    // 추상 메소드의 재정의
    @Override
    public void run() {
        System.out.println("속도는 : " + speed);
    }
    @Override
    public void printname() {
        System.out.println("주인의 이름은 : " + name);
    }

    // 게터
    public void getOil() {
        System.out.println("기름의 양 : " + oil);
    }

    // toString의 재정의
    @Override
    public String toString() {
        return "차 주인 : " + name + ", 속도는 : " + speed + ", 기름의 양 : " + oil;
    }
}
