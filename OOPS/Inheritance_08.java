public class Inheritance_08 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
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
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("Swimming...");
    }
}