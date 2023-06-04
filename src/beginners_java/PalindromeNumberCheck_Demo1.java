package beginners_java;

import java.util.Scanner;

public class PalindromeNumberCheck_Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,num,r,temp;
        System.out.print("Enter any number: ");
        num=input.nextInt();
        temp=num;
        input.close();
        while (temp!=0) {
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if (num==sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
    }
    
}
