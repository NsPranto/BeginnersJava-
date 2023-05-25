package beginners_Java;

import java.util.Scanner;

public class Assignment11_FactorialOf_n {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i, fact=1;
            int n;
            System.out.print("Enter any value for 'n' to calculate the factorial digit: ");
            n=input.nextInt();

            for (i=1; i<=n; i++) {
                fact=fact*i;
                
            }
            input.close();
            System.out.println("Factorial of "+n+" is: "+fact);
        }
        
    }
    
    
}
