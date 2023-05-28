package beginners_Java;

import java.util.Scanner;

public class InstallmentCalculation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int PhonePrice = 1800; //1800 euros
        int NumberOfInstallments, InstallmentPerMonth;
        System.out.print("Enter number of Installments you want: ");
        NumberOfInstallments= input.nextInt();
        InstallmentPerMonth= PhonePrice/NumberOfInstallments;
        System.out.println("The Required Monthly Payment: "+InstallmentPerMonth+" euros");
        input.close();
    }
    
}
