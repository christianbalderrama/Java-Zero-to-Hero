package Refresher.OOP;

import java.sql.SQLOutput;

public class Constructors {
    public static void main(String[] args) {
        // Empty Constructors
        Animal animal1 = new Animal();
        animal1.setType("Dog");
        System.out.println(animal1.getType());

        // Overloading Constructors
        Animal animal2 = new Animal("Cat");
        System.out.println(animal2.getType());
    }
}

class Animal {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    /**
     * A constructor in Java is a special method that is used to initialize objects.
     *
     * The constructor is called when an object of a class is created.
     * It can be used to set initial values for object attributes:
     *
     * Even if this empty constructor is not declared explicitly is it created under the hood.
     * Usually created when there's needed to be set for the variables or process some logic etc.
     */
    public Animal() {
        System.out.println("ANIMAL: EMPTY CONSTRUCTOR");
    }

    public Animal(String type) {
        System.out.println("ANIMAL WITH 1 PARAMETER: " + type);
        this.type = type;
    }
}
