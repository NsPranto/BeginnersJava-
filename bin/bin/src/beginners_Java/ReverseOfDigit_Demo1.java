package beginners_Java;

import java.util.Scanner;

public class ReverseOfDigit_Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,num,r,temp;

        System.out.print("Enter any digit: ");
        num=input.nextInt();
        temp=num;

        while (temp!=0) {
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.print("Reverse of given digit: "+sum);
        input.close();
    }
    
}