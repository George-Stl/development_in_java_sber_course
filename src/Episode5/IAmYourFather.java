package Episode5;

import java.util.HashMap;
import java.util.Map;

public class IAmYourFather {
    public static void main(String[] args) {
        try{
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
        } catch(NullPointerException e){
            System.out.println(e.getClass().getSimpleName());
        }


    }
}
