package Episode3;

public class YouWereMyBrother {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi("Luke", 1000);
        Jedi jedi2 = new Jedi(2000, "Leia");
        Jedi jedi3 = new Jedi(10000, "Anakin", "dark");

        Jedi[] jedis = new Jedi[3];
        jedis[0] = jedi1;
        jedis[1] = jedi2;
        jedis[2] = jedi3;
        for(int i = 0; i < jedis.length; i++){
            if(jedis[i].getSideOfForce().equals("light")){
                System.out.println(jedis[i]);
            }
        }
        for(int i = 0; i < jedis.length; i++){
            if(jedis[i].getSideOfForce().equals("dark")){
                System.out.println(jedis[i]);
            }
        }

    }

    static class Jedi {
        private String name;
        private int age;
        private int midichlorians;
        private String homeworld;
        private String species;
        private String sideOfForce = "light";
        public Jedi(String name, int midichlorians){
            this.name = name;
            this.midichlorians = midichlorians;
        }
        public Jedi(int midichlorians, String name){
            this.midichlorians = midichlorians;
            this.name = name;
        }
        public Jedi(String name, int midichlorians, int age){
            this.name = name;
            this.midichlorians = midichlorians;
            this.age = age;
        }
        public Jedi (String name, int midichlorians, int age, String homeworld){
            this.name = name;
            this.midichlorians = midichlorians;
            this.age = age;
            this.homeworld = homeworld;
        }
        public Jedi (String name, int midichlorians, int age, String homeworld, String species){
            this.name = name;
            this.midichlorians = midichlorians;
            this.age = age;
            this.homeworld = homeworld;
            this.species = species;
        }
        public Jedi(int midichlorians, String name, String sideOfForce){
            this.midichlorians = midichlorians;
            this.name = name;
            this.sideOfForce = sideOfForce;
        }
        public String getSideOfForce(){
            return sideOfForce;
        }
        @Override
        public String toString(){
            return name + " " + midichlorians + " side: " + sideOfForce;
        }
    }
}
