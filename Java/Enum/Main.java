package Java.Enum;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        
        if (today == Day.MONDAY) {
            System.out.println("Today is Monday.");
        }
    }
}