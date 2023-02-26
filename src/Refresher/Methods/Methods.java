package Refresher.Methods;

public class Methods {
    public static void main(String[] args) {
        myMethod();
        myMethod("Christian");
        System.out.println(myMethod("Christian", "Balderrama"));
    }

    // `static` means that the method belong to the Main class and not an object of the Main class.
    // `void` means that this method does not have a return value.
    static void myMethod() {
        System.out.println("myMethod");
    }

    // need to provide an argument/parameter when calling `myMethod` to invoke this function.
    static void myMethod(String name) {
        System.out.println("My name is: " + name);
    }

    static String myMethod(String firstName, String lastName) {
        return "My full name is: " + firstName + " " + lastName;
    }
}
