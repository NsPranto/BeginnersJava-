package beginners_java;

import java.util.Scanner;

public class FactorialOf_N {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,Fact=1;
        System.out.print("Enter any positive integr: ");
        n=input.nextInt();
        input.close();

        for (int i=n; i>=1; i--) {
            Fact=Fact*i;
            System.out.print(i+"x");            
        }
        System.out.println("Factorial of"+n+" = "+Fact);
    }
    
}
