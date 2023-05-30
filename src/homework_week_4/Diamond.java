package homework_week_4;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the diamond pattern: ");
        int numRows = scanner.nextInt();


        int currentRow = 1;
        while (currentRow <= numRows) {
            int spaces = numRows - currentRow;
            int stars = 2 * currentRow - 1;

            int spaceCount = 1;
            while (spaceCount <= spaces) {
                System.out.print(" ");
                spaceCount++;
            }

            int starCount = 1;
            while (starCount <= stars) {
                System.out.print("*");
                starCount++;
            }

            System.out.println();
            currentRow++;
        }

        currentRow = numRows - 1;
        while (currentRow >= 1) {
            int spaces = numRows - currentRow;
            int stars = 2 * currentRow - 1;

            int spaceCount = 1;
            while (spaceCount <= spaces) {
                System.out.print(" ");
                spaceCount++;
            }

            int starCount = 1;
            while (starCount <= stars) {
                System.out.print("*");
                starCount++;
            }

            System.out.println();
            currentRow--;
        }
        scanner.close();
    }
}

