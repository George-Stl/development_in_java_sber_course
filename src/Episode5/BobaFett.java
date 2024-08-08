package Episode5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BobaFett {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) == list.get(i + 1)) && !map.containsKey(list.get(i))) {
                map.put(list.get(i), 2);
            } else if ((list.get(i) == list.get(i + 1)) && map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());
        System.out.println("Largest sequence: " + Collections.max(set));
    }
}
