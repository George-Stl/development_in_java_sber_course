package Episode3;

public class Betrayal {
    public static void main(String[] args) {
        Jedi jedi = new Jedi();
        jedi.initialize("Kray Noah", 31, 78_000);
    }
    static class Jedi{
        private String name;
        private int age;
        private int midichlorians;
        public void initialize(String name, int age, int midichlorians){
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }
    }
}
