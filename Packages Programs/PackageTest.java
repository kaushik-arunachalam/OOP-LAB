import package1.Calculator;

public class PackageTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(8, 2));
        System.out.println("Multiplication: " + calc.multiply(4, 7));
    }
}
