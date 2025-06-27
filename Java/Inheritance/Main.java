package Java.Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> car = new ArrayList<>();     // Car 타입을 저장하는 ArrayList

        // 클래스 형변환으로 Car를 Volvo가 상속 받았기 때문에 가능
        // Car[] car = new Volvo[] {}; 와 비슷하다.
        car.add(new Volvo("Hyun", 100, 200));
        
        
        car.add(new Volvo("Park", 50, 200));
        car.add(new Volvo("Kim", 98, 200));

        // forEach문으로 ArrayList를 재정의한 toString()으로 전부 출력
        for(Car c : car) {
            System.out.println(c.toString());
        }
    }
}