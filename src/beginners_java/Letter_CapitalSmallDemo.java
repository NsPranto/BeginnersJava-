package beginners_java;

import java.util.Scanner;

public class Letter_CapitalSmallDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch=input.next().charAt(0);
        input.close();

        if (ch>='a' && ch<='z') {
            System.out.println("Small Letter!");
        }else if (ch>='A' && ch<='Z') {
            System.out.println("Capital Letter!");
        } 
        else {
            System.out.println("Not a letter!");
        }
    }
    
}
