package operators;

public class Dog {
    String name;
    String says;
    void setName(String n) {
        name = n;
    }
    void setSays(String s) {
        says = s;
    }
    void showName() {
        System.out.println(name);
    }
    void speak() {
        System.out.println(says);
    }

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.setName("Spoty");
        spot.setSays("Гав");
        scruffy.setName("Scuffy");
        scruffy.setSays("Мяу");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();
    }
}
