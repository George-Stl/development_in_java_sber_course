package Episode3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChancellorsWill {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        if(value > 0){
            if (value % 2 == 0) System.out.println("compassion");
            else System.out.println("mercy");
        } else if (value < 0){
            if (value % 2 == 0) System.out.println("pain");
            else System.out.println("anger");
        } else System.out.println("balance");
    }
}
