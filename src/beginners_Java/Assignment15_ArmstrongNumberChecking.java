package beginners_Java;

import java.util.Scanner;

public class Assignment15_ArmstrongNumberChecking {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,i,temp,r,sum=0,count=0;
        System.out.print("Enter initial number: ");
        m=input.nextInt();
        System.out.print("Enter final number: ");
        n=input.nextInt();
        System.out.print("Armstrong numbers from "+m+" to "+n+" are: ");
        input.close();
        for (i=m; i<=n; i++) {
            temp=i;
            while (temp!=0) {
                r=temp%10; 
                sum=sum+r*r*r;
                temp=temp/10;
            }
            if (i==sum) {
                System.out.print(i+" ");
                count++;
            }
            sum=0;
        }
        System.out.println();
        System.out.println("& total Armstrong number from "+m+" to "+n+" are: "+count);
        
    }
    
}
