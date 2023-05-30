package homework_week_4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("The Fibonacci series is  " );
        for (int i = 1; i<= number; i++){
            System.out.println(fibonacciSeries(i)+ ".");
        }
        scanner.close();
    }
    public static int fibonacciSeries(int n){
        if(n <= 1){
            return n;
        }else {
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }
}
