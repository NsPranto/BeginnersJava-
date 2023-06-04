package beginners_java;

import java.util.Scanner;

public class TemperatureDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double fahrenheit,celsius;
        System.out.print("Farhrenheit= ");
        fahrenheit=input.nextDouble();
        celsius= 0.6*(fahrenheit-32);
        System.out.println("Celsius="+celsius);
        input.close();
    }
    
}
