package beginners_Java;

import java.util.Scanner;

public class Assignment14_GenerateAndCountPalindromeNumbersFrom_m_to_n {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,sum=0,count=0,temp,r;
        System.out.print("Enter first number: ");
        m=input.nextInt();
        System.out.print("Enter last number: ");
        n=input.nextInt();
        System.out.print("The palindrome numbers between "+m+" to "+n+" are: ");
        for (int i=m; i<=n; i++) {
            temp=i;
            while (temp!=0 && i>10) {
                r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            }
            if (i==sum) {
                System.out.print(i+" ");
                count++;
            }
            sum=0;
        }
        System.out.println("");
        System.out.println( "And total palindrome numbers are = "+count);
        input.close();
    }
    
}
