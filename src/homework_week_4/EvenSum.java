package homework_week_4;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        scanner.close();
        int evenDigit = getEvenDigitSum(number);
        System.out.println("Sum of the even digit is : " + evenDigit);
    }
    public static int getEvenDigitSum(int number){
        if (number <0){
return -1;
        }
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
