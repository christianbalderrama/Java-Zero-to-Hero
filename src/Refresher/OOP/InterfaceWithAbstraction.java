package Refresher.OOP;

public class InterfaceWithAbstraction {
    public static void main(String[] args) {
        Pigzzz pig = new Pigzzz();
        pig.sleep();
        pig.animalSound();
    }
}

class Pigzzz extends Animalzz {
    @Override
    public void animalSound() {
        System.out.println("OINK!");
    }
}


abstract class Animalzz implements Sounds {
    public void sleep() {
        System.out.println("zzZz");
    }
}

interface Sounds {
    void animalSound();
}
