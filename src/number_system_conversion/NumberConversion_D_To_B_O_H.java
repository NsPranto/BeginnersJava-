package number_system_conversion;
//Convert Binary,Octal,Hexadecimal into ---> Decimal

import java.util.Scanner;

public class NumberConversion_D_To_B_O_H {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int decimal;
        System.out.print("Enter any Decimal number: ");
        decimal=input.nextInt();
        String binary = Integer.toBinaryString(decimal);//Decimal-->Binary
        System.out.println("It's Binary value = "+binary);
        input.close();
    }
}
