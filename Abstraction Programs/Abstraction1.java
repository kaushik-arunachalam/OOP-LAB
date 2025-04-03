abstract class Vehicle {
    abstract void start(); // Abstract method

    void fuel() {
        System.out.println("Fueling the vehicle...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.fuel();
    }
}
