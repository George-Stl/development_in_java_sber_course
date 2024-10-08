package Episode5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class OldMaster {
    public static void main(String[] args) {
        System.out.println(getInsertTime(new ArrayList()));
        System.out.println(getInsertTime(new LinkedList()));
    }

    public static long getInsertTime(List list) {
        Date currentTime = new Date();

        insert10000(list);

        Date newTime = new Date();
        return newTime.getTime() - currentTime.getTime();

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
