package array_demo;

import java.util.Scanner;

public class Assignment18_PrintDayName {
    public static void main(String[] args) {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any day number of a week, ex:(1-7) : ");
        int num = input.nextInt();

        for (int i = 1; i <= days.length; i++) {
            if (i == num) {
                System.out.println(days[num - 1]);
            }
        }
        input.close();

    }
}
