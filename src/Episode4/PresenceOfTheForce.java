package Episode4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PresenceOfTheForce {
    public static void main(String[] args) throws Exception{
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int[] firstArr = new int[arr.length / 2];
        int[] secondArr = new int[arr.length / 2];
        firstArr = Arrays.copyOfRange(arr, 0, arr.length / 2);
        secondArr = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
    }
}
