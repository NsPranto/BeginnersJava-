package array_demo;

import java.util.Scanner;

public class Array1_Intro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println();
        double[] number=new double[5];
        double sum=0;

        number[0]= input.nextDouble();
        number[1]= input.nextDouble();
        number[2]= input.nextDouble();
        number[3]= input.nextDouble();
        number[4]= input.nextDouble();
        

        sum= number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum of Arrays = "+sum);
        
        int len=number.length;
        System.out.print("Array size= "+len);
        input.close();
    }
    
}
