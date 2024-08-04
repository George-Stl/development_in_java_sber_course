package Episode4;

import java.util.ArrayList;

public class ObiWansMission {
    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList<>();
        list.add("May");
        list.add("the Force");
        list.add("be");
        list.add("with you");
        list.add("always!");
        System.out.println(list.size());
        for(String str : list){
            System.out.println(str);
        }

    }
}
