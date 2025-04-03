class Person {
    String name;
    int age;
    String city;

    // Constructor with one parameter
    Person(String name) {
        this.name = name;
    }

    // Constructor with two parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with three parameters
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

public class Poly7 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob", 25);
        Person p3 = new Person("Charlie", 30, "New York");

        p1.display();
        p2.display();
        p3.display();
    }
}
