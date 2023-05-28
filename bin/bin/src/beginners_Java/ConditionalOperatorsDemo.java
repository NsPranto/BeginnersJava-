package beginners_Java;

import java.util.Scanner;

public class ConditionalOperatorsDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,Large;
        System.out.print("Enter two numbers: ");
        num1=input.nextInt();
        num2=input.nextInt();
        Large=(num1>num2)? num1:num2;
        System.out.println("The larger numnber is: "+Large);
        input.close();

    }
    
}
