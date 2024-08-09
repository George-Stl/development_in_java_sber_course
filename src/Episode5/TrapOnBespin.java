package Episode5;

import java.util.HashMap;
import java.util.Map;

public class TrapOnBespin {
    public static Map<String, String> createMap(){
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < 10; i++){
            map.put(String.valueOf(Character.toChars(65 + i)), String.valueOf(Character.toChars(97 + i)));
        }
        return map;
    }
    public static int getCountFirstName(Map<String, String> map, String firstName ){
        int counter = 0;
        for(String str : map.values()){
            if(str.equals(firstName)){
                counter++;
            }
        }
        return counter;
    }
    public static int getCountLastName(Map<String, String> map, String secondName){
        int counter = 0;
        for(String str : map.keySet()){
            if(str.equals(secondName)){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map);
        System.out.println(getCountFirstName(map, "a"));
        System.out.println(getCountLastName(map, "E"));

    }
}
