package beginners_java;

import java.util.Scanner;

public class FibonacciSeries_Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many numbers? : ");
        int n=input.nextInt();
        input.close();

        int first=0;
        int second=1;
        int fibo;
        System.out.print(first+" "+second);

        for (int i=3; i<=n; i++) {
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
        System.out.println("\n");
    }
    
}
