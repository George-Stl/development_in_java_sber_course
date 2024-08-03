package Episode3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DarkSideOfTheForce {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double value = Double.parseDouble(reader.readLine());
        if(value > 0){
            System.out.println("It's Light side");
        } else if(value < 0){
            System.out.println("It's Dark side");
        } else System.out.println("It's balance");
    }
}
