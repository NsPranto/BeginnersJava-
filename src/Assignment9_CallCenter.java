import java.util.Scanner;

public class Assignment9_CallCenter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("To select Bengali, press: 1");
        System.out.println("To select Hindi, press: 2");
        System.out.println("To select Urdu, press: 3");
        System.out.println("To select English, press: Press any digit except 1,2,3");
        System.out.println("Except digit, it'll be an invalid input!");
        number=input.nextInt();

        switch (number) {
            case 1:
            System.out.println("Your selected language is Bengali");
                break;
        
            case 2:
            System.out.println("Your selected language is Hindi");
                break;
            
            case 3:
            System.out.println("Your selected language is Urdu");
                break;
            
            default:
            System.out.println("Your selected language is English");
            break;
            
        }
    }
    
}
