package Episode2;

import java.util.Scanner;

public class FightWithCountDooku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sumDigitsInNumber(number));

    }
    public static int sumDigitsInNumber(int number){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
