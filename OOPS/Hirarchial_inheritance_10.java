public class Hirarchial_inheritance_10 {
    public static void main(String[] args) {
        Fish nemo = new Fish();
        nemo.eat();
        nemo.swim();

        Bird tweety = new Bird();
        tweety.eat();
        tweety.fly();

        Mammal doggy = new Mammal();
        doggy.eat();
        doggy.walk();
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
    void walk() {
        System.out.println("Walking...");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swimming...");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flying...");
    }
}