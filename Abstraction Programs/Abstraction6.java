interface Printer {
    void print();

    default void show() {
        System.out.println("Default Printer");
    }
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Printing with Laser Printer...");
    }
}

public class Abstraction6 {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.print();
        printer.show();
    }
}
