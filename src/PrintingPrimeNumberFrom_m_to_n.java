import java.util.Scanner;

public class PrintingPrimeNumberFrom_m_to_n {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,count=0,totalprime=0;
        System.out.print("Enter first number: ");
        m=input.nextInt();
        System.out.print("Enter last number:  ");
        n=input.nextInt();

        for (int i=m; i<=n; i++) {
            for (int j=2; j<=i-1; j++) {
                if (i%j==0) {
                    count++;
                break;
                }
            }
            if (count==0) {
                System.out.println(i);
                totalprime++;
            }
              count=0;
        }
        System.out.println("Number of tptal prime numbers are: "+totalprime);  
    }
    
    
}
