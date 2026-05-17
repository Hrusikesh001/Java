public class Multi_level_inheritance_09 {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eating...");
    }

    void breathe() {
        System.out.println("Breathing...");
    }
}

class Mammal extends Animal {
    int legs;
}
class Dog extends Mammal {
    String breed;
}