package homework_week_4;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.calculateSum();
    }
    public void calculateSum(){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count<10){
            System.out.println("Enter number : " + count + " : ");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                System.out.println(" Invalid number ");
            }
            scanner.nextLine();
        }
        System.out.println(" Sum of the number is : " + sum);
        scanner.close();
    }
}
