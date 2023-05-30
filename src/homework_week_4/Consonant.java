package homework_week_4;

import java.util.Scanner;

public class Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = scanner.nextLine();

        if (isValidInput(input)) {
            char character = input.charAt(0);
            if (isLetter(character)) {
                if (isNotConsonant(character)) {
                    System.out.println("The character is not  a consonant.");
                } else {
                    System.out.println("The character is a consonant.");
                }
            } else {
                System.out.println("Invalid input: Not a letter.");
            }
        } else {
            System.out.println("Invalid input: Length > 1.");
        }
    }

    public static boolean isValidInput(String input) {
        return input.length() == 1;
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isNotConsonant(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
