package Episode4;

public class DestroyingTheRebelBase {
    public static class ItsMessage{
        public String getDescription(){
            return " Description ";
        }
    }
    public static void printMessage(ItsMessage itsMessage){
        System.out.println(itsMessage.getDescription());
    }

    public static void main(String[] args) {
        printMessage(new ItsMessage());
    }
}
