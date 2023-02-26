package Refresher.OOP;

public class Encapsulation {
    public static void main(String[] args) {
        // See here we can access and modify the properties of the Car which is not safe.
        Car car1 = new Car();
        car1.brand = "Ford";
        System.out.println("BRAND : " + car1.brand);

        // We cannot access and modify the property `brand` of this Car2 class.
        // We need to invoke the `setBrand` as the `brand` attribute is only
        // accessible to the Car2 class.
        Car2 car2 = new Car2();
        car2.setBrand("Porsche");
        System.out.println(car2.getBrand());
    }
}

/**
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 * To achieve this, you must:
 *
 * 1. declare class variables/attributes as `private`
 * 2. provide `public` get and set methods to access and update the value of a private variable
 */
class Car2 {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

}

class Car {
    public String brand;
}
