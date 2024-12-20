import java.util.Scanner;

public class AntWarrior {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // 정수 N을 입력받기
        int n = scr.nextInt();
        // 개행 문자 처리
        scr.nextLine();
        // 모든 식량 정보 입력받기
        String[] array = scr.nextLine().split(" ");

        // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
        int[] d = new int[100];

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(바텀업)
        d[0] = Integer.parseInt(array[0]);
        d[1] = Math.max(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
        for(int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + Integer.parseInt(array[i]));
        }

        // 계산된 결과 출력
        System.out.println(d[n - 1]);
    }
}
