package beginners_java;

import java.util.Scanner;

public class ArithmaticDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,result;
        
        System.out.print("Enter first number:");
        num1=input.nextInt();
        System.out.print("Enter second number:");
        num2=input.nextInt();
        
        result=num1+num2;
        System.out.println("Summetion= "+result);
        result=num1-num2;
        System.out.println("Subtraction= "+result);
        result=num1*num2;
        System.out.println("Multiplication= "+result);
        double result2=(double)num1/num2;
        System.out.println("Division= "+result2);
        result=num1%num2;
        System.out.println("Reminder= "+result);
        input.close();
        
    }
}
