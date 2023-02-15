import java.util.Scanner;

public class Assignment8_LogicalAND {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch1,ch2;
        System.out.print("Have you completed your masters? [Choose between: y/n] [y=yes/n=no] ");
        ch1=input.next().charAt(0);
        System.out.print("Are you fluent in English? [Choose between: y/n] [y=yes/n=no] ");
        ch2=input.next().charAt(0);

        if (ch1=='y' && ch2=='y') {
            System.out.println("Congratulations! You're eligible for interview!");
        }else if (ch1=='n' && ch2=='n' || ch1=='y' && ch2=='n' || ch1=='n' && ch2=='y') {
            System.out.println("Sorry! You're not eligible for interview!");
        }
        else {
            System.out.println("Invalid! Please enter a valid input!");
        }
    }
    
}
