package Episode4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Yawin4 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        int i = 13;
        while(i > 0){
            String last = list.remove(list.size() - 1);
            list.add(0, last);
            i--;
        }
        for(String str : list){
            System.out.println(str);
        }
    }
}
