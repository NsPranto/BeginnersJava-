package array_demo;

public class Array1_IntroAndDeclaration {
    public static void main(String[] args) {
        int[] number = new int[5];

        number[0] = 11;
        number[1] = 12;
        number[2] = 13;
        number[3] = 14;
        number[4] = 15;

        int sum = number[0]+ number[1]+ number[2]+ number[3]+ number[4];
        System.out.println("Sum of all the arrays= "+sum);
        System.out.println("4th index= "+number[4]);
        int length = number.length;
        System.out.println("Array size= "+length);
    }
}
