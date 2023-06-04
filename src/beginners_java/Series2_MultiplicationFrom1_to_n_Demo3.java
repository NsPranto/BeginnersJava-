package beginners_java;

import java.util.Scanner;

public class Series2_MultiplicationFrom1_to_n_Demo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double n,multiplication=1;
        System.out.print("Enter last number: ");
        n=input.nextDouble();
        input.close();

        for (double i=1.5; i<=n; i++) {
            multiplication*=i;
            System.out.print(i+" x ");
        }
        System.out.println("= "+multiplication);
    }
    
}
