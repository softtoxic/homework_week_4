package homework_week_4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is the prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        scanner.close();
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(number); i++){
            if (number % 1 == 0){
                return false;
            }
        }
        return  true;
    }
}
