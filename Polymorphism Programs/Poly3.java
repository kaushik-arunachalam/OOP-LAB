class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine starting");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        super.startEngine(); // Calls parent class method
        System.out.println("Car engine started");
    }
}

public class Poly3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
    }
}
