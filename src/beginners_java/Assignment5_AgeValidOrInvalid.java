package beginners_java;

import java.util.Scanner;

public class Assignment5_AgeValidOrInvalid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.print("Please input your age: ");
        age=input.nextInt();
        input.close();
        if (age>=18) {
            System.out.println("You're a valid voter");
            
        } else {
            System.out.println("You're an invalid voter");
            
        }
    }
    
}
