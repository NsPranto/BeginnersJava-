package array_demo;

import java.util.Scanner;

public class Array2_SumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        System.out.print("Please enter 5 numbers: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        // number[0]=1
        // number[2]=2
        // number[3]=3
        // number[4]=4
        // number[5]=5

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Sum of the arrays: " + sum);

        double avg = sum / number.length;
        System.out.println("The average is: " + avg);
        input.close();

    }

}
