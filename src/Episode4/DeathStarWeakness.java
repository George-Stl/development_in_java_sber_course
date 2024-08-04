package Episode4;

import java.util.ArrayList;

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
        int j = strings.size();
        for(int i = 0; i < j; i++){
            if(strings.get(i).contains("d") && strings.get(i).contains("j")){
                continue;
            } else if(strings.get(i).contains("d")){
                strings.remove(i);
                i--;
                continue;
            } else if(strings.get(i).contains("s")){
                strings.add(strings.get(i));
                continue;
            }
        }

        return strings;
    }
}
