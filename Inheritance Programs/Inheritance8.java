class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int grade) {
        super(name); // Call parent constructor
        this.grade = grade;
    }

    void displayStudent() {
        display(); // Call parent method
        System.out.println("Grade: " + grade);
    }
}

public class Inheritance8 {
    public static void main(String[] args) {
        Student s = new Student("Alice", 10);
        s.displayStudent();
    }
}
