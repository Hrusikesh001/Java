public class Method_Overriding_12 {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("Eat Anything...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Eat Dog Food...");
    }
}