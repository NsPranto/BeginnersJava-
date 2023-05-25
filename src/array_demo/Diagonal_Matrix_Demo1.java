package array_demo;

import java.util.Scanner;

public class Diagonal_Matrix_Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumOfDiagonalElements = 0;
        int SumOfUpperTriangleElements = 0;
        int SumOfLowerTriangleElements = 0;
        System.out.println("Enter matrix elements: ");

        // Input of the Matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }

        // This loop if for summetion of Diagonal,Upper & Lower triangle elements
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    SumOfDiagonalElements = SumOfDiagonalElements + A[row][col];
                }

                if (row < col) {
                    SumOfUpperTriangleElements = SumOfUpperTriangleElements + A[row][col];
                }

                if (row > col) {
                    SumOfLowerTriangleElements = SumOfLowerTriangleElements + A[row][col];
                }
            }
        }
        System.out.println("Sum Of Diagonal Elements: " + SumOfDiagonalElements);
        System.out.println("Sum Of Upper Triangle Elements: " + SumOfUpperTriangleElements);
        System.out.println("Sum Of Lower Triangle Elements: " + SumOfLowerTriangleElements);
        input.close();
    }
}
