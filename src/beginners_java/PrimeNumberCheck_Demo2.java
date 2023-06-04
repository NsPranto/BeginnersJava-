package beginners_java;

import java.util.Scanner;

public class PrimeNumberCheck_Demo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int num=input.nextInt();
        int count=0;
        input.close();

        if (num==0 || num==1) {
            System.out.println("Prime Number");
        }else{
            for (int i=2; i<num; i++) {
                if (num%i==0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println("Prime Number");
                 } else {
                System.out.println("Not a prime Number");
                 }
        }
             

        
    }
    
}
