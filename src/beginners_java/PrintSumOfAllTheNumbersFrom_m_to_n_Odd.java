package beginners_java;

import java.util.Scanner;

public class PrintSumOfAllTheNumbersFrom_m_to_n_Odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,sum=0;

        System.out.print("Enter initial number: ");
        m=input.nextInt();
        System.out.print("Enter last number: ");
        n=input.nextInt();
        input.close();

        for (int i=m; i<=n; i++) {
            if (i%2!=0) {
                sum+=i;
                System.out.print(" "+i);
            }
        }
        System.out.println();
        System.out.println("The sum of all odd numbers between "+m+" & "+n+" is =" +sum);
    }
}
