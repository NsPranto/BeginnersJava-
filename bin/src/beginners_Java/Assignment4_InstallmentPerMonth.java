package beginners_Java;

import java.util.Scanner;

public class Assignment4_InstallmentPerMonth {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int phonePrice = 1800; // 1800 euros
            int numberOfInstallment, installmentPerMonth;
    
            System.out.print("Number of installments? "); // get number of installments from user
            numberOfInstallment=input.nextInt();
            installmentPerMonth=phonePrice/numberOfInstallment; // calculate  installment amount for per month
            System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
            input.close();
        
        
    
    }
}
