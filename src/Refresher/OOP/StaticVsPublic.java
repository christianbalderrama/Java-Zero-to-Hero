package Refresher.OOP;

public class StaticVsPublic {
    public static void main(String[] args) {
        // functions declared with `public` needs object before it can be called.
        Public publicClass = new Public();
        publicClass.publicMethod();

        // `static` functions can be called directly.
        Statics.staticMethod();
    }
}

// Anything declared with `public` needs an object to be created before it can be accessed.
class Public {
    public void publicMethod() {
        System.out.println("IM CALLED IN PUBLIC CLASS");
    }
}

// `static` type methods can be called directly by accessing the class without creating new objects.
class Statics {
    static void staticMethod() {
        System.out.println("IM CALLED IN STATIC CLASS WITHOUT NEW OBJECT");
    }
}
