class Car {
    private String model;
    private int speed;

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    // Setter methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative");
        }
    }
}

public class Encap4 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Tesla Model 3");
        c.setSpeed(120);
        System.out.println("Car Model: " + c.getModel());
        System.out.println("Speed: " + c.getSpeed() + " km/h");
    }
}

