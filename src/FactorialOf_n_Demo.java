import java.util.Scanner;

public class FactorialOf_n_Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,fact=1;
        System.out.print("Enter any integer positive number: ");
        n=input.nextInt();

        for (int i=1; i<=n; i++) {
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" = "+fact);
    }
    
}
