package Episode5;

import java.util.*;

public class Chase {
    public static List getListForGet(int size) {
        long arrTime = getTimeGet(new ArrayList<>(), size);
        long linkTime = getTimeGet(new LinkedList<>(), size);
        if (arrTime < linkTime) {
            return new ArrayList<>();
        } else if (linkTime < arrTime) {
            return new LinkedList<>();
        } else return null;
    }

    public static long getTimeGet(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.get(random.nextInt(size));
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static List getListForSet(int size) {
        if (getTimeSet(new ArrayList<>(), size) < getTimeSet(new LinkedList<>(), size)) {
            return new ArrayList<>();
        } else if (getTimeSet(new ArrayList<>(), size) > getTimeSet(new LinkedList<>(), size)) {
            return new LinkedList<>();
        } else return null;
    }

    public static long getTimeSet(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = size; i > 0; i--) {
            list.set(random.nextInt(size), i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static List getListForAddOrInsert(int size) {
        if ((getTimeAdd(new ArrayList<>(), size) < getTimeAdd(new LinkedList<>(), size)) && (
                getTimeInsert(new ArrayList<>(), size) < getTimeInsert(new LinkedList<>(), size))) {
            return new ArrayList<>();
        } else if ((getTimeAdd(new ArrayList<>(), size) > getTimeAdd(new LinkedList<>(), size)) && (
                getTimeInsert(new ArrayList<>(), size) > getTimeInsert(new LinkedList<>(), size))) {
            return new LinkedList<>();
        } else {
            return null;
        }
    }

    public static long getTimeAdd(List list, int size) {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getTimeInsert(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size), i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static List getListForRemove(int size) {
        if (getTimeRemove(new ArrayList<>(), size) < getTimeRemove(new LinkedList<>(), size)) {
            return new ArrayList<>();
        } else if (getTimeRemove(new ArrayList<>(), size) > getTimeRemove(new LinkedList<>(), size)) {
            return new LinkedList<>();
        } else return null;
    }

    public static long getTimeRemove(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < size / 10; i++) {
            list.remove(random.nextInt(size - size/10));
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static void main(String[] args) {
        int size = 10_000;
        System.out.print("For get best is: ");
        if(Chase.getListForGet(size) instanceof ArrayList){
            System.out.println("ArrayList");
        } else if(Chase.getListForGet(size) instanceof LinkedList){
            System.out.println("LinkedList");
        }

        System.out.print("For set best is: ");
        if(Chase.getListForSet(size) instanceof ArrayList){
            System.out.println("ArrayList");
        } else if(Chase.getListForSet(size) instanceof LinkedList){
            System.out.println("LinkedList");
        }

        System.out.print("For remove best is: ");
        if(Chase.getListForRemove(size) instanceof ArrayList){
            System.out.println("ArrayList");
        } else if(Chase.getListForRemove(size) instanceof LinkedList){
            System.out.println("LinkedList");
        }

        System.out.print("For add or insert best is: ");
        if(Chase.getListForAddOrInsert(size) instanceof ArrayList){
            System.out.println("ArrayList");
        } else if (Chase.getListForAddOrInsert(size) instanceof LinkedList){
            System.out.println("LinkedList");
        }


    }
}
