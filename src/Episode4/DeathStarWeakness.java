package Episode4;

import java.util.ArrayList;
import java.util.Iterator;

public class DeathStarWeakness {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("darth");
        strings.add("vaider");
        strings.add("skywalker");
        strings.add("jedi");
        strings = Arraylist(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> Arraylist(ArrayList<String> strings) {
        ArrayList<String> toAdd = new ArrayList<>();

        for(Iterator<String> iterator = strings.iterator(); iterator.hasNext();){
            String str = iterator.next();
            if(str.contains("d") && !str.contains("j")){
                iterator.remove();

            } else if(str.contains("s")){
                toAdd.add(str);
            }
        }
        strings.addAll(toAdd);

        return strings;
    }
}
