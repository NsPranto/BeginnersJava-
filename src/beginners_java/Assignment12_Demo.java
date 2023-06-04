package beginners_java;

import java.util.Scanner;

public class Assignment12_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter starting number: ");
        int m = sc.nextInt();
        
        System.out.print("Enter ending number: ");
        int n = sc.nextInt();
        
        int sum = 0;

        sc.close();
        
        for(int i=m;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum+=i;
            }
        }
        System.out.println("Sum of odd numbers from "+m+" to "+n+": "+sum);
    }
    
}
