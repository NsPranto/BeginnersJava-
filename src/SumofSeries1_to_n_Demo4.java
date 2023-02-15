import java.util.Scanner;

public class SumofSeries1_to_n_Demo4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double n,sum=0;
        System.out.print("Enter last number: ");
        n=input.nextDouble();

        for (double i=1.5; i<=n; i++) {
            sum=sum+i;
            System.out.print(" "+i);
        }
        System.out.println(" = "+sum);
    }
    
}
