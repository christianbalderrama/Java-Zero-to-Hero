package Refresher.OOP;

public class Interface {
    public static void main(String[] args) {
        Pigzz pig = new Pigzz();
        pig.animalSound();
        pig.sleep();
    }
}

class Pigzz implements AnimalSounds {
    @Override
    public void animalSound() {
        System.out.println("OINK!");
    }

    @Override
    public void sleep() {
        System.out.println("ZzZzZz OINK!");
    }
}

/**
 * An interface is a completely "abstract class" that is used to group related methods with empty bodies:
 * And instead of `extends` it should be used as `implements` keyword
 */
interface AnimalSounds {
    void animalSound();
    void sleep();
}
