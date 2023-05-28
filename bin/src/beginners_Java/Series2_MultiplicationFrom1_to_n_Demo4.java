package beginners_Java;

import java.util.Scanner;

public class Series2_MultiplicationFrom1_to_n_Demo4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,multiplication=1;
        System.out.print("Enter lust number: ");
        n=input.nextInt();

        for (int i=1; i<=n; i++) {
            multiplication=multiplication*i*i;
            System.out.print(i+"x"+i+" x ");
        }
        System.out.println("= "+multiplication);
        input.close();
    }
    
}
