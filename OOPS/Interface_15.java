public class Interface_15 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
        
        Bear b = new Bear();
        b.eatPlants();
        b.eatMeat();
    }
}

interface ChessPlayer {
    void move();
}

interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("eats plants...");
    }
    public void eatMeat() {
        System.out.println("eats meat...");
    }
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("up, down, left, right, diagonal...");
    }
}

class Rook implements ChessPlayer {
    public void move() {
        System.out.println("up, down, left, right...");
    }
}