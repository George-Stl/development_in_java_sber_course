package Episode4;

public class CloneTroopers {
    private static int cloneCount = 0;
    public static void setCloneCount(int count){
        cloneCount = count;
    }
    public static int getCloneCount(){
        return cloneCount;
    }
    public CloneTroopers(){
        cloneCount++;
    }
    public static void main(String[] args) {
        setCloneCount(100);
        System.out.println(getCloneCount());
    }
}
