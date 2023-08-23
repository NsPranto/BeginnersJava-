package string_package;

import java.util.Scanner;

public class Palindrome_Demo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String s1;
       System.out.print("Enter any word: ");
       s1 = input.nextLine();
       StringBuffer s2 = new StringBuffer(s1);
       String sb = s2.reverse().toString(); //Converts 'StringBuffer' to normal String 

       if (sb.equals(s1)) {  //equality checking method
        System.out.println("Palindrome");
       } else {
        System.out.println("Not Palindrome");
       }
       input.close();
    }
}
