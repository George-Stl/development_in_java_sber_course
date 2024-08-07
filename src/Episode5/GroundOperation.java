package Episode5;

import java.util.HashMap;
import java.util.Map;

public class GroundOperation {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("leia", "leia");
        map.put("veider", "veider");
        map.put("darth", "darth");
        map.put("anakin", "anakin");
        map.put("skywalker", "skywalker");
        map.put("star", "star");
        map.put("wars", "wars");
        map.put("dron", "dron");
        map.put("yoda", "yoda");
        map.put("master", "master");
        printHeroes(map);
    }
    public static void printHeroes(Map<String, String> map) {
        for(String str : map.values()){
            System.out.println(str);
        }
    }
}
