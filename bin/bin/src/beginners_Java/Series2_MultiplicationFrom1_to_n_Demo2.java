package beginners_Java;

import java.util.Scanner;

public class Series2_MultiplicationFrom1_to_n_Demo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n, multiplication=1;
        System.out.print("Enter the lust number: ");
        n=input.nextInt();

        for (int i=1; i <=n; i=i+2) {
            multiplication*=i;
            System.out.print(i+"x");
        }
        System.out.println("= "+multiplication);
        input.close();
    }
    
}
