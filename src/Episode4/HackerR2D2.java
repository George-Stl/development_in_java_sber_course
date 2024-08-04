package Episode4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerR2D2 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        int forth = Integer.parseInt(reader.readLine());
        int fifth = Integer.parseInt(reader.readLine());
        int[] values = new int[]{first, second, third, forth, fifth};
        print(sort(values));

    }
    public static int[] sort(int[] values){

        for(int i = 0; i < values.length - 1; i++){
            int low = values[i];
            int lowIndex = i;
            for(int j = i; j < values.length; j++){
                if(low > values[j]){
                    low = values[j];
                    lowIndex = j;
                }
            }
            if(i != lowIndex){
                int temp = values[i];
                values[i] = low;
                values[lowIndex] = temp;
            }
        }
        return values;
    }
    public static void print(int[] values){
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i] + " ");
        }
    }

}
