package Episode5;

public class FaithfulAstrodroid {
    public static void main(String[] args) {
        try{
            int [] m = new int[3];
            m[6] = 5;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
