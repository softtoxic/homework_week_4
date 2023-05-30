package homework_week_4;

import java.util.Scanner;

public class FirstAndLastSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = sumFirstAndLastDigit(number);
        System.out.println("Sum of the first and last digit: " + sum);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Invalid value
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0) {
            if (number < 10) {
                firstDigit = number;
            }
            number /= 10;
        }

        return firstDigit + lastDigit;
    }
}
