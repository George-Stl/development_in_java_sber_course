package Episode2;

public class ZamVessel {
    public static void main(String[] args) {
        Zam zam = new Zam();
        Dron dron = new Dron();
        zam.spy = dron;
        dron.hunter = zam;


    }

}
class Zam{
    Dron spy;
    int a, b, c;
}
class Dron{
    Zam hunter;
    int a, b, c;
}
