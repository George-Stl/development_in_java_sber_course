package Episode3;

public class JediTempleMassacre {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi("Naomi");
        Jedi jedi2 = new Jedi("Lypsy", 13);
        Jedi jedi3 = new Jedi("Lee-Kar", 7, "Lightsaber");
    }
    static class Jedi{
        private String name;
        private int numberOfWounds;
        private String typeOfWeapon;
        public Jedi(String name){
            this.name = name;
        }
        public Jedi(String name, int numberOfWounds){
            this.name = name;
            this.numberOfWounds = numberOfWounds;
        }
        public Jedi(String name, int numberOfWounds, String typeOfWeapon){
            this.name = name;
            this.numberOfWounds = numberOfWounds;
            this.typeOfWeapon = typeOfWeapon;
        }
    }
}
