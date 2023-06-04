package beginners_java;

import java.util.Scanner;

public class Assignment7_LogicalOR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Do you love java? ");
        ch=input.next().charAt(0);
        input.close();

        if (ch=='y'||ch=='Y') {
            System.out.println("You're a java lover!");
        }else if (ch=='n'||ch=='N') {
            System.out.println("You aren't a java lover!");
        } 
        else {
            System.out.println("Invalid input!");
        }
    }
    
}
