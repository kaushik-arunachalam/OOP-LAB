interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks...");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
