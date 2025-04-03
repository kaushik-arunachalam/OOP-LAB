class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        super.draw(); // Call parent class method
        System.out.println("Drawing Circle");
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
