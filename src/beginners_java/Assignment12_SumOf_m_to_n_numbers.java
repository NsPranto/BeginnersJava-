package beginners_java;

import java.util.Scanner;

public class Assignment12_SumOf_m_to_n_numbers {
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        int i,m,n,sum=0;
        System.out.println("Enter any two numbers [[here>> m=first number, n=last number]] to calculate the sum of all the odd numbers between m & n !"); 

        System.out.print("Enter first number [m]: ");
        m=input.nextInt();
        System.out.print("Enter last number [n]: ");
        n=input.nextInt();
        input.close();

        for (i=m; i<=n; i++) {
            if (i%2!=0) {
                sum=sum+i;
            }
        }
        System.out.println("The sum of all the odd numbers between "+m+" to "+n+" = "+sum);
    }
    
}
