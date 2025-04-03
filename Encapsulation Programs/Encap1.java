import studentinfo.studentinfo;

class Student {
    private String name;
    private int age;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

public class Encap1 {
    public static void main(String[] args) {
        studentinfo s = new studentinfo(null, 0);
        s.setName("Alice");
        s.setAge(20);
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
