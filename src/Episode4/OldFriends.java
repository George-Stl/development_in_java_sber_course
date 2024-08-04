package Episode4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class OldFriends {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        Collections.sort(list);
        int i = list.get(0).length();
        for(String str : list){
            if(str.length() == i) {
                System.out.println(str);
            }
        }
    }
}
