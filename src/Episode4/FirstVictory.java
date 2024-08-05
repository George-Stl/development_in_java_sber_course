package Episode4;

import java.util.ArrayList;

public class FirstVictory {
    public static void main(String[] args) {
        Jedi jedi0 = new Jedi("Dooku", true, 59);
        Jedi jedi1 = new Jedi("Qwai-Gon", true, 56, jedi0.name);
        Jedi jedi2 = new Jedi("Obi-Wan", true, 43, jedi1.name);
        Jedi jedi3 = new Jedi("Anakin", true, 32, jedi2.name);
        Jedi jedi4 = new Jedi("Luke", true, 19, "You");
        Jedi jedi5 = new Jedi("Mace Windu", true, 45);
        Jedi jedi6 = new Jedi("Lana", false, 32);

        ArrayList<Jedi> jedis = new ArrayList<>();

        jedis.add(jedi0);
        jedis.add(jedi1);
        jedis.add(jedi2);
        jedis.add(jedi3);
        jedis.add(jedi4);
        jedis.add(jedi5);
        jedis.add(jedi6);

        man(jedis);
    }
    public static <E> void man(ArrayList<E> list){
        for(E e : list){
            System.out.println(e);
        }
    }
    public static class Jedi {
        String name;
        boolean sex;
        int age;
        String teacher;
        public Jedi(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Jedi(String name, boolean sex, int age, String teacher){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.teacher = teacher;
        };
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.teacher != null) {
                text += ", учитель: " + this.teacher;
            }
            return text;
        }
    }
}
