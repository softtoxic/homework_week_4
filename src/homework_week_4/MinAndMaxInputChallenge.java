package homework_week_4;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.MinMax();
    }

    public void MinMax() {
        Scanner scanner= new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                System.out.println("Invalid input! Exiting...");
                break;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        scanner.close();
    }
}
