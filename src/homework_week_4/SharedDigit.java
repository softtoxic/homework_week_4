package homework_week_4;

import java.util.Scanner;

public class SharedDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        boolean isInRange = hasSharedDigit(number);

        System.out.println("Result: " + isInRange);

        scanner.close();
    }

    public static boolean hasSharedDigit(int number) {
        return number >= 10 && number <= 99;
    }
}
