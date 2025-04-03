class Bird {
    void makeSound() {
        System.out.println("Bird is singing");
    }
}

class Parrot extends Bird {
    @Override
    void makeSound() {
        System.out.println("Parrot is talking");
    }
}

public class Poly2 {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.makeSound(); // Calls overridden method in Parrot
    }
}
