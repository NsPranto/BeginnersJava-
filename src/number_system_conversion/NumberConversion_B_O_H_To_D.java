package number_system_conversion;
//Convert Binary,Octal,Hexadecimal into ---> Decimal

public class NumberConversion_B_O_H_To_D {
    public static void main(String[] args) {
        String binary = "101011";
        Integer decimal1 = Integer.parseInt(binary, 2);//Binary-->Decimal
        System.out.println("Binary --> Decimal = "+decimal1);

        String octal = "675";
        Integer decimal2 = Integer.parseInt(octal, 8);//Octal-->Decimal
        System.out.println("Octal --> Decimal = "+decimal2);

        String hexadecimal = "A";
        Integer decimal3 = Integer.parseInt(hexadecimal, 16);//Hexadecimal-->Decimal
        System.out.println("Hexadecimal --> Decimal = "+decimal3);
    }
}
