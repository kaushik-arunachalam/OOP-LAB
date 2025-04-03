class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Poly4 {
    public static void main(String[] args) {
        Shape myShape = new Circle(); // Upcasting
        myShape.draw(); // Calls overridden method in Circle
    }
}
