package algorithm;

import java.util.Scanner;
public class Knight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        String inputData = scanner.nextLine();
        
        int row = Integer.parseInt(inputData.substring(1));
        
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트의 이동 경로
        int[][] steps = {
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}
        };

        int result = 0;
        
        // 가능한 이동 경로 계산
        for (int[] step : steps) {
            int nextRow = row + step[0];
            
            int nextColumn = column + step[1];
            
            // 유효한 위치인지 체크
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result++;
            }
        }

        // 결과 출력
        System.out.println(result);
        
        scanner.close();
    }
}