abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Poly6 {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();

        myAnimal1.makeSound(); // Calls Dog's method
        myAnimal2.makeSound(); // Calls Cat's method
    }
}
