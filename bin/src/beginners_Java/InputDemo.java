package beginners_Java;

import java.util.Scanner;

public class InputDemo{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Double num;
        System.out.print("Enter any number: ");
        num=input.nextDouble();
        System.out.println("The Double number is: "+num);
        input.close();
    }
}
