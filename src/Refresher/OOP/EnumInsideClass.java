package Refresher.OOP;

public class EnumInsideClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH,
    }

    public static void main(String[] args) {
        System.out.println(Level.LOW);
        System.out.println(TestEnum.LOW);
    }
}
