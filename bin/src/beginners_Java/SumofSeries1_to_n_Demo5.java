package beginners_Java;

import java.util.Scanner;

public class SumofSeries1_to_n_Demo5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter last number: ");
        n=input.nextInt();

        for (int i = 1; i<=n; i=i+1) {
            sum=sum+i*i;
            System.out.print(i+"x"+i+" + ");
        }
        System.out.println(" = "+sum);
        input.close();
    }
    
}
