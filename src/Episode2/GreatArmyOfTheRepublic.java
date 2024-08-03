package Episode2;

import java.util.Scanner;

public class GreatArmyOfTheRepublic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jedisArrived = 212;
        int jedisLeft = scanner.nextInt();
        System.out.println("Number of jedis fallen = " + (jedisArrived - jedisLeft));
    }
}
