package beginners_java;

import java.util.Scanner;

public class Assignment13_FebonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Which fibonacci number you want to see? :");
        int n=input.nextInt();
        int first=0,second=1,fibonacci;
        System.out.print(first+" "+second);
        input.close();

        for (int i=3; i<=n; i++) {
            fibonacci=first+second;
            System.out.print(" "+fibonacci);
            first=second; second=fibonacci;
        }
        System.out.println("\n");
    }
    
}
