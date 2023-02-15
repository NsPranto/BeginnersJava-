import java.util.Scanner;

public class PrintSumOfAllTheNumbersFrom_m_to_n {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int m,n;
        System.out.print("Enter the initial number: ");
        m=input.nextInt();

        System.out.print("Enter the last number to calculate sum: ");
        n=input.nextInt();

        for (int i=m; i<=n; i++) {
            sum=sum+i;
        }
        System.out.println("The sum between "+m+" & "+n+" = "+sum);
    }
    
}
