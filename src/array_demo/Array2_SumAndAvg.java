package array_demo;

import java.util.Scanner;

public class Array2_SumAndAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.print("Please enter 5 numbers: ");

        /*
         * number[0] = input.nextDouble(); //Normal 5 arrays input
         * number[1] = input.nextDouble();
         * number[2] = input.nextDouble();
         * number[3] = input.nextDouble();
         * number[4] = input.nextDouble();
         */

        // sum = number[0]+number[1]+number[2]+number[3]+number[4]; --> Normal summetion

        for (int i = 0; i < number.length; i++) { // For loop for taking continious inputs
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) { // Summetion using for loop
            sum = sum + number[i];
        }
        System.out.println("Sum is= " + sum);

        double average = sum / number.length;
        System.out.println("The Average is " + average);
        input.close();
    }
}
