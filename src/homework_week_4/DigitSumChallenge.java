package homework_week_4;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(digitSum(125));
        System.out.println(digitSum(1));
        System.out.println(digitSum(9));
        System.out.println(digitSum(-125));
    }
    public static int digitSum(int number){
        if (number < 10 || number <0) {
            return -1;
        }
        int sum = 0;
        while (number >0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
                return sum;
    }

}
