package Episode4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GarbageBlock {
    public static void main(String[] args) {
        String [] arr = new String[5];
        try{
            arr = loader();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(Arrays.toString(calculate(arr)));

    }
    public static String[] loader() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        for(int i = 0; i < 5; i++){
            arr[i] = reader.readLine();
        }
        return arr;
    }
    public static int[] calculate(String[] arr){
        int[]arrInt = new int[arr.length];
        for(int i = 0; i < arrInt.length; i++){
            arrInt[i] = arr[i].length();
        }
        return arrInt;
    }
}
