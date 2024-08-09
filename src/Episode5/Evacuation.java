package Episode5;

public class Evacuation {
    public static void main(String[] args) {
        try{
            int a = 42 / 0;
        } catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
