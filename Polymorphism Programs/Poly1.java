class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) { // Overloaded method
        return a + b + c;
    }
}

public class Poly1{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (2 numbers): " + calc.add(10, 20));
        System.out.println("Sum (3 numbers): " + calc.add(10, 20, 30));
    }
}
