// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang

// Test Case 1: matrixAddition
// Input Matrix 1 : [[2,2,2,2], [4,4,0,0]]
// Input Matrix 2 : [[2,2,4,4], [1,2,2,0]]
// Expected Output :[[4, 4, 6, 6], [5, 6, 2, 0]]
// Actual Output : [[4, 4, 6, 6], [5, 6, 2, 0]]
// Test Case 1: matrixMultiplication
// Input Matrix 1 : [[2,2,2,2], [4,4,0,0]]
// Input Matrix 2 : [[2,2,4,4], [1,2,2,0]]
// Expected Output :[[4, 4, 8, 8], [4, 8, 0, 0]]
// Actual Output : [[4, 4, 8, 8], [4, 8, 0, 0]]
// Test Case 2: matrixAddition
// Input Matrix 1 : [[2,2,2,2], [4,4,0,0]]
// Input Matrix 2 : [[2,2,4,4], [1,0,0,0,0]]
// Expected Output :null
// Actual Output : null
// Test Case 2: matrixMultiplication
// Input Matrix 1 : [[2,2,2,2], [4,4,0,0]]
// Input Matrix 2 : [[2,2,4,4], [1,0,0,0,0]]
// Expected Output :null
// Actual Output : null
import java.util.Arrays;
public class Lab9{
    static int[][] matrixAddition(int m1[][], int rows_m1, int cols_m1, int m2[][], int rows_m2, int cols_m2){
        if (rows_m1 != rows_m2 || cols_m1 != cols_m2) {
            return null;
        }
        int[][] result = new int[rows_m1][cols_m1];
        for (int i = 0; i < rows_m1; i++) {
            for (int j = 0; j < cols_m1; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return result;
    }
    static int[][] matrixMultiplication(int m1[][], int rows_m1, int cols_m1, int m2[][], int rows_m2, int cols_m2) {
        if (rows_m1 != rows_m2 || cols_m1 != cols_m2) {
            return null;
        }

        int[][] result = new int[rows_m1][cols_m1];

        for (int i = 0; i < rows_m1; i++) {
            for (int j = 0; j < cols_m1; j++) {
                result[i][j] = m1[i][j] * m2[i][j];
            }
        }
        return result;
    }

public static void main(String[] args) {
    int[][] m1 = {
            {2, 2, 2, 2},
            {4, 4, 0, 0}
    };
    int[][] m2 = {
            {2, 2, 4, 4},
            {1, 2, 2, 0}
    };
    int[][] m3 = {
            {2, 2, 2, 2},
            {4, 4, 0, 0}
    };
    int[][] m4 = {
            {2, 2, 4, 4},
            {1, 0, 0, 0, 0}
    };
    System.out.println(Arrays.deepToString(matrixAddition(m1,2,4,m2,2,4)));
    System.out.println(Arrays.deepToString(matrixMultiplication(m1,2,4,m2,2,4)));
    System.out.println(Arrays.deepToString(matrixAddition(m1,2,4,m3,2,5)));
    System.out.println(Arrays.deepToString(matrixMultiplication(m1,2,4,m4,2,5)));
    }
}

