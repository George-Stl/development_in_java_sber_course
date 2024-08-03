package Episode3;

public class Jedi {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi("Me", 25, 172, "Human");
        Jedi jedi2 = new Jedi("Obi-Wan", 42, 168, "Human");
        Jedi jedi3 = new Jedi("Yoda", 348, 64, "Yoda");

    }
    private String name;
    private int age;
    private String race;
    private int height;
    public Jedi(String name, int age, int height, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.height = height;
    }
}
