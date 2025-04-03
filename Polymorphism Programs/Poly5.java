class Printer {
    void print(int num) {
        System.out.println("Printing int: " + num);
    }

    void print(double num) {
        System.out.println("Printing double: " + num);
    }

    void print(String text) {
        System.out.println("Printing string: " + text);
    }
}

public class Poly5 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);
        p.print(99.99);
        p.print("Hello, Java!");
    }
}
