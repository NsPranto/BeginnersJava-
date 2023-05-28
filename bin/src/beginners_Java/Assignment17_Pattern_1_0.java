package beginners_Java;

import java.util.Scanner;

public class Assignment17_Pattern_1_0 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many lines do you want? n= ");
        int n=input.nextInt();
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=row; col++) {
                System.out.print(" "+col%2);
            }
            System.out.println();
        }
        input.close();
    }
    
}
