package algorithm;

import java.util.Scanner;

public class LRUD {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.err.print("지도 크기 N : ");
        int N = scr.nextInt();
        
        scr.nextLine();
        
        System.out.print("이동 계획 : ");
        String moves = scr.nextLine();
        String[] move = moves.split(" ");

        int x = 1;
        int y = 1;
        int[] dx = { 0, 0, -1, 1};
        int[] dy = { -1, 1, 0, 0};
        int nx = 0, ny = 0;

        String[] move_type = {"L", "R", "U", "D"};

        for(int i = 0; i < move.length; i++) {
            for(int j = 0; j < move_type.length; j++ ) {
                if(move[i].equals(move_type[j])) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(nx < 1 || ny < 1 || nx > N || ny > N) {
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
        scr.close();
    }
}
