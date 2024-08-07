package Episode5;

import java.util.HashSet;
import java.util.Set;

public class IcyHothPlanet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("dron");
        set.add("galaxy");
        set.add("jedi");
        set.add("wars");
        set.add("star");
        set.add("yoda");
        set.add("master");
        set.add("Luke");
        set.add("force");
        set.add("sith");
        for(String str : set){
            System.out.println(str);
        }
    }
}
