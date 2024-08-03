package Episode4;

public class ForceBalance {
    public static int theForce = 0;
    protected void finalize() throws Throwable{
        theForce--;
    }
    public ForceBalance(){
        theForce++;
    }

    public static void main(String[] args) {
        ForceBalance force = new ForceBalance();

        System.out.println(ForceBalance.theForce);
    }
}
