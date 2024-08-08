package Episode5;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class OldFriend {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for(int i = 0; i < 20; i++){
            set.add(random.nextInt(40));
        }
        return set;
    }
    public static Set<Integer> removeGreaterThan10(Set<Integer> set) {
        HashSet<Integer> set1 = new HashSet<>();
        for(Integer value : set){
            if(value <= 10) set1.add(value);
        }
        return set1;
    }
    public static void main(String[] args) {
        Set<Integer> set = createSet();
        System.out.println(removeGreaterThan10(set));
    }
}
