package Episode3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SithLord {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean num = false;
        int positive = 0;
        int negative = 0;
        while (!num) {
            System.out.print("Введите целое число (или 0 для выхода): ");
            int a = Integer.parseInt(reader.readLine());
            if (a == 0) {
                break;
            }
            else if (a > 0)
                positive++;
            else
                negative++;
        }
        while (positive != 0){
            System.out.println("Feel the power of Light Side");
            positive--;
        }
        while (negative != 0){
            System.out.println("Feel the power of the Dark Side");
            negative--;
        }
    }
}
