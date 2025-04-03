class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    Car(int speed) {
        super(speed); // Call parent constructor
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car(120);
        myCar.displaySpeed();
    }
}
