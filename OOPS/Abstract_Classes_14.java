public interface Abstract_Classes_14 {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor...");
    }

    void eat() {
        System.out.println("animal eats...");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor...");
    }
    void changeColor() {
        color = "black";
    }
    void walk() {
        System.out.println("walks on 4 legs...");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor...");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("walks on 2 legs...");
    }
}