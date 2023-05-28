package array_demo;

import java.util.Scanner;

public class Array5_Create_SummetionAndSubtraction_of_2_2DMatrixs_pt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.println("Enter Matrix elements of A[2][3]: ");
        // Getting input for A Matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]= ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("\n");

        System.out.println("Enter Matrix elements of B[2][3]: ");
        // Getting input for B Matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]= ", row, col);
                B[row][col] = input.nextInt();
            }
        }

        // Printing A matrix
        System.out.print("A= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println();
        }

        System.out.println("\n");

        // Printing B matrix
        System.out.print("B= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + B[row][col]);
            }
            System.out.println();
        }

        // Adding A matrix & B Matrix

        System.out.println("\n");

        System.out.print("A+B= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (A[row][col] + B[row][col]));
            }
            System.out.println();
        }

        // Subtracting B matrix from A Matrix
        System.out.println("\n");

        System.out.print("A-B= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (A[row][col] - B[row][col]));
            }
            System.out.println();
        }

        // Multiplicating of A matrix and B Matrix
        System.out.println("\n");

        System.out.print("A*B= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (A[row][col] * B[row][col]));
            }
            System.out.println();
        }
        input.close();
    }
}
