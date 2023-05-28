package beginners_Java;

import java.util.Scanner;

public class ArmstrongNumber_Check_Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,r,temp,sum=0;
        System.out.print("Enter any number: ");
        num=input.nextInt();
        temp=num;
        while (temp!=0) {
           r=temp%10;
           sum=sum+r*r*r;
           temp=temp/10;
        }
        if (num==sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        input.close();
    }
    
}
