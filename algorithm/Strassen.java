package algorithm;

import java.util.Arrays;

class StrassenMatrixMultiplication {
    // 행렬을 부분 행렬로 분할하는 함수
    public int[][][] splitMatrix(int[][] matrix) {
        int n = matrix.length;
        int mid = n / 2;

        int[][][] result = new int[4][mid][mid];
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < mid; j++) {
                result[0][i][j] = matrix[i][j]; // A11
                result[1][i][j] = matrix[i][j + mid]; // A12
                result[2][i][j] = matrix[i + mid][j]; // A21
                result[3][i][j] = matrix[i + mid][j + mid]; // A22
            }
        }
        return result;
    }

    // 쉬트라쎈 알고리즘을 구현한 함수
    public int[][] strassen(int[][] A, int[][] B) {
        int n = A.length;

        // 기저 사례: 1x1 행렬
        if (n == 1) {
            int[][] result = new int[1][1];
            result[0][0] = A[0][0] * B[0][0];
            return result;
        }

        // 행렬 분할
        int[][][] splitA = splitMatrix(A);
        int[][][] splitB = splitMatrix(B);

        int[][] A11 = splitA[0];
        int[][] A12 = splitA[1];
        int[][] A21 = splitA[2];
        int[][] A22 = splitA[3];

        int[][] B11 = splitB[0];
        int[][] B12 = splitB[1];
        int[][] B21 = splitB[2];
        int[][] B22 = splitB[3];

        // 쉬트라쎈의 7가지 곱셈
        int[][] M1 = strassen(add(A11, A22), add(B11, B22));
        int[][] M2 = strassen(add(A21, A22), B11);
        int[][] M3 = strassen(A11, subtract(B12, B22));
        int[][] M4 = strassen(A22, subtract(B21, B11));
        int[][] M5 = strassen(add(A11, A12), B22);
        int[][] M6 = strassen(subtract(A21, A11), add(B11, B12));
        int[][] M7 = strassen(subtract(A12, A22), add(B21, B22));

        // 결과 행렬 계산
        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        // 결과 행렬 병합
        int[][] result = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                result[i][j] = C11[i][j];
                result[i][j + n / 2] = C12[i][j];
                result[i + n / 2][j] = C21[i][j];
                result[i + n / 2][j + n / 2] = C22[i][j];
            }
        }
        return result;
    }

    // 행렬 덧셈 함수
    public int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // 행렬 뺄셈 함수
    public int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        
        return result;
    }
}

public class Strassen {
    public static void main(String[] args) {
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        
        int[][] A = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 1, 2, 3},
            {4, 5, 6, 7}
        };
        
        int[][] B = new int[][] {
            {8, 9, 1, 2},
            {3, 4, 5, 6},
            {7, 8, 9, 1},
            {2, 3, 4, 5}
        };
        
        int[][] result = strassenMatrixMultiplication.strassen(A, B);
        
        System.out.print("쉬트라쎈의 행렬곱셈 : ");
        
        for(int[] row : result) {
            System.out.print(Arrays.toString(row) + " ");
        }

    }
}
