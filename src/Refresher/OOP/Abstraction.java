package Refresher.OOP;

public class Abstraction {
    public static void main(String[] args) {
        Pigz pig = new Pigz();
        pig.sleep();
        pig.animalSound();

        Dogz dog = new Dogz();
        dog.sleep();
        dog.animalSound();
    }
}

/**
 * The `animalSound` must be overwritten/implemented since this was declared as `abstract`
 * For this example, all animals have sound, but they differ to what animal and needs to be implemented by their own way.
 *
 * Not overriding this function should throw an error.
 */
class Pigz extends Animalz {
    @Override
    public void animalSound() {
        System.out.println("OInk");
    }
}

class Dogz extends Animalz {
    @Override
    public void animalSound() {
        System.out.println("Arf!");
    }
}

/**
 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
 */
abstract class Animalz {
    public abstract void animalSound();
     public void sleep() {
         System.out.println("ZZZZzZ");
     }
}
