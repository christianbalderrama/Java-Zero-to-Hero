package Refresher.OOP;

public class Classes {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        System.out.println("Value of X: " + secondClass.getX());
    }
}

class SecondClass {
    private int x = 5;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

