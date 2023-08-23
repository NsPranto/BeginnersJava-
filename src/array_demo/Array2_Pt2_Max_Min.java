package array_demo;

import java.util.Scanner;

public class Array2_Pt2_Max_Min {
    public static void main(String[] args) {
        double[] number = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 5 numbers: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max<number[i]) {
                max= number[i];
            }
            if (min>number[i]) {
                min = number[i];
            }
        }
        System.out.println("Max number is: "+max);       
        System.out.println("Min number is: "+min);
        input.close();

    }
}
