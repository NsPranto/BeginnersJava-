package beginners_java;

import java.util.Scanner;

public class MultiplicationTable_Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, multiplication=1;
        System.out.print("Enter any number for multiplication table: ");
        num=input.nextInt();
        input.close();

        for (int i=1; i<=10; i++) {
            multiplication=num*i;
            System.out.println(num+"x"+i+"= "+multiplication);
        }

    }
    
}
