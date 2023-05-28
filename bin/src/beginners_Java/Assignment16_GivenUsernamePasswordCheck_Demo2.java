package beginners_Java;

import java.util.Scanner;

public class Assignment16_GivenUsernamePasswordCheck_Demo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String username;
        int password;
        int count=1;
         do {
            System.out.print("Enter username: ");
            username=input.nextLine();
            System.out.print("Enter password: ");
            password=input.nextInt();

            if (username.equals("anis") || password==12345) {
                System.out.println("WELCOME TO THE SYSTEM");
                count=2;
            } else {
                System.out.println("Incorrect username/password");
            }
         } while (count==1);
         input.close();
    }
}
