package Episode3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InSearchOfPalpatine {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        switch(value){
            case 1:
                System.out.println("Duku is gere");
                break;
            case 2:
                System.out.println("It's a trap!");
                break;
        }
    }
}
