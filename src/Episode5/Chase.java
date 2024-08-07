package Episode5;

import java.util.*;

public class Chase {
    public static List getListForGet() {

        long arrTime = getTimeGet(new ArrayList<>());
        long linkTime = getTimeGet(new LinkedList<>());
        if(arrTime < linkTime){
            return new ArrayList<>();
        } else if(linkTime < arrTime){
            return new LinkedList<>();
        } else return null;

    }
    public static long getTimeGet(List list){
        for(int i = 0; i < 100000; i ++){
            list.add(i);
        }
        Date startTime = new Date();
        Random random = new Random();
        for(int i = 0; i < 100000; i++){
            list.get(random.nextInt(0, 100000));
        }
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }
    public static List getListForSet() {
        if(getTimeSet(new ArrayList<>()) < getTimeSet(new LinkedList<>())){
            return new ArrayList<>();
        }else if (getTimeSet(new ArrayList<>()) > getTimeSet(new LinkedList<>())){
            return new LinkedList<>();
        } else return null;
    }
    public static long getTimeSet(List list){

        for(int i = 0; i < 10000; i ++){
            list.add(i);
        }
        Random random = new Random();
        Date start = new Date();
        for(int i = 0; i < 10000; i ++){
            list.set(random.nextInt(0, 10000), i);
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    public static List getListForAddOrInsert() {
        if((getTimeAdd(new ArrayList<>()) < getTimeAdd(new LinkedList<>())) && (
                getTimeInsert(new ArrayList<>()) < getTimeInsert(new LinkedList<>()))){
            return new ArrayList<>();
        }else if ((getTimeAdd(new ArrayList<>()) > getTimeAdd(new LinkedList<>())) && (
                getTimeInsert(new ArrayList<>()) > getTimeInsert(new LinkedList<>()))){
            return new LinkedList<>();
        } else{
            return null;
        }
    }
    public static long getTimeAdd(List list){
        Date start = new Date();
        for(int i = 0; i < 100000; i++){
            list.add(i);
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    public static long getTimeInsert(List list){
        for(int i = 0; i < 10000; i++){
            list.add(i);
        }
        Date start = new Date();
        Random random = new Random();
        for(int i = 0; i < 1000; i++){
            list.add(random.nextInt(0, 10000), i);
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    public static List getListForRemove() {
        if(getTimeRemove(new ArrayList<>()) < getTimeRemove(new LinkedList<>())){
            return new ArrayList<>();
        }else if (getTimeRemove(new ArrayList<>()) > getTimeRemove(new LinkedList<>())){
            return new LinkedList<>();
        } else return null;

    }
    public static long getTimeRemove(List list){
        for(int i = 0; i < 100000; i ++){
            list.add(i);
        }
        Random random = new Random();
        Date start = new Date();
        for(int i = 0; i < 10000; i++){
            list.remove(random.nextInt(0, 90000));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    public static void main(String[] args) {

        System.out.print("For get best is: ");
        if(getListForGet() instanceof ArrayList){
            System.out.println("ArrayList");
        } else if(getListForAddOrInsert() instanceof LinkedList){
            System.out.println("LinkedList");
        }

        System.out.print("For set best is: ");
        if(getListForSet() instanceof ArrayList){
            System.out.println("ArrayList");
        } else if(getListForAddOrInsert() instanceof LinkedList){
            System.out.println("LinkedList");
        }

        System.out.print("For remove best is: ");
        if(getListForRemove() instanceof ArrayList){
            System.out.println("ArrayList");
        } else if(getListForAddOrInsert() instanceof LinkedList){
            System.out.println("LinkedList");
        }

        System.out.print("For add or insert best is: ");
        if(getListForAddOrInsert() instanceof ArrayList){
            System.out.println("ArrayList");
        } else if (getListForAddOrInsert() instanceof LinkedList){
            System.out.println("LinkedList");
        }


    }
}
