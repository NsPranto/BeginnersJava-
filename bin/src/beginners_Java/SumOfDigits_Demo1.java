package beginners_Java;

import java.util.Scanner;

public class SumOfDigits_Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,r,temp,num;
        System.out.print("Enter any number: ");
        num=input.nextInt();

        temp=num;
        while (temp!=0) {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.print("The sum of digits: "+sum);
        input.close();
    }
    
}
