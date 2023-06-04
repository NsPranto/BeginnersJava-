package beginners_java;

import java.util.Scanner;

public class SumofSeries1_to_n_Demo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n, sum=0;
        System.out.print("Enter last number: ");
        n=input.nextInt();
        input.close();

        for (int i=2; i<=n; i=i+2) {
            sum=sum+i;
            System.out.print(" "+i);
        }
        System.out.println(" = "+sum);
    }
    
}
