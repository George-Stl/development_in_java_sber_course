package Episode3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FatalDecision {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String user = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        while(n > 0){
            System.out.println(user);
            n--;
        }
    }
}
