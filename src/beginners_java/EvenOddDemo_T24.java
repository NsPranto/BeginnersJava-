package beginners_java;

import java.util.Scanner;

public class EvenOddDemo_T24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter any positive interger type number: ");
        num=input.nextInt();
        input.close();
        if (num%2==0) {
            System.out.println("It's a even number!");
        } else {
            System.out.println("It's an odd number!");
        }
    }
}
