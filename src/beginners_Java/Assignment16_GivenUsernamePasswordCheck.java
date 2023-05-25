package beginners_Java;

import java.util.Scanner;

public class Assignment16_GivenUsernamePasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        int password;

        while (true) {
            System.out.print("Enter username: ");
            username = input.nextLine();
            System.out.print("Enter password: ");
            password = input.nextInt();

            if (username.equals("anis") && password == 12345) {
                System.out.println("Welcome to the system");
                break;
            } else {
                System.out.println("username/password is incorrect.please try again");
            }
        }
        input.close();

    }
}
