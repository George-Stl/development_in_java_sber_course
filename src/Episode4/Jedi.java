package Episode4;

public class Jedi {
    protected void finalize() throws Throwable{
        System.out.println("Object jedi was destroyed");
    }

}
class Sith{
    protected void finalize() throws Throwable{
        System.out.println("Object sith was destroyed");
    }

}
