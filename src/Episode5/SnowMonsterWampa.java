package Episode5;

import java.util.HashMap;
import java.util.Map;

public class SnowMonsterWampa {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Leia", "Organa");
        map.put("Luke", "Skywalker");
        map.put("General", "Hux");
        map.put("Captain", "Phasma");
        map.put("Darth", "Vader");
        map.put("Obi-Wan", "Kenobi");
        map.put("Anakin", "Skywalker");
        map.put("Jar-Jar", "Binks");
        map.put("Count", "Dooku");
        map.put("Master", "Yoda");
        for(Map.Entry<String, String> mapIterate : map.entrySet()){
            System.out.println(mapIterate.getKey() + " " + mapIterate.getValue());
        }

    }


}
