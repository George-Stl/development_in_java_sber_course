package Episode4;

public class Droid {
    private static int droidsCount = 0;
    public Droid(){
        droidsCount++;
    }
    public static int getDroidsCount(){
        return droidsCount;
    }

    public static void main(String[] args) {
        Droid droid1 = new Droid();
        Droid droid2 = new Droid();
        System.out.println(getDroidsCount());
    }
}
