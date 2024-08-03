package Episode2;

import java.util.Scanner;

public class PetranakiArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int count = scanner.nextInt();
        System.out.println("Master " + name + " has arrived with " + count + " jedis");
    }
}
