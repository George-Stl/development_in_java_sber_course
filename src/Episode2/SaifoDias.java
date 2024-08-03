package Episode2;

public class SaifoDias {
    public static void main(String[] args) {
        Clone1 clone1 = new Clone1();
        Clone2 clone2 = new Clone2();
        Clone3 clone3 = new Clone3();
        Dias saifo = new Dias();
        clone1.owner = saifo;
        clone2.owner = saifo;
        clone3.owner = saifo;
    }



    public static class Clone1{
        public Dias owner;
    }
    public static class Clone2{
        public Dias owner;
    }
    public static class Clone3{
        public Dias owner;
    }
    public static class Dias{

    }
}

