package beginners_java;

import java.util.Scanner;

public class MultiplicationTableDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n;
        System.out.print("Enter initial Number: ");
        m=input.nextInt();
        System.out.print("Enter final Number: ");
        n=input.nextInt();
        System.out.println("\n");
        input.close();

        for (int i=m; i<=n; i++) {
            for (int j=1; j<=10; j++) {
                System.out.println(i+"x"+j+"= "+i*j);
            }
            System.out.println("\n");
        }
        
    }
    
}
