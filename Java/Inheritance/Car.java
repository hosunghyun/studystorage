package Java.Inheritance;

public abstract class Car {     // 추상 클래스
    protected String name;  // 차주인 이름
    protected int speed;    // 차의 속도

    // 생성자
    protected Car() {
        name = "";
        speed = 0;
    }
    protected Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // 세터
    protected void setName(String name) {
        this.name = name;
    }
    protected void setSpeed(int speed) {
        this.speed = speed;
    }
    
    // 게터
    protected String getName() {
        return name;
    }
    protected int getSpeed() {
        return speed;
    }

    // 추상 메소드
    abstract void run();
    abstract void printname();
}
