package homework_week_4;

import java.util.Scanner;

public class SymbolTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the special character: ");
        char character = scanner.next().charAt(0);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
