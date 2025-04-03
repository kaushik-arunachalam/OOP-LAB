package package2;

public class EmployeeDetails {
    private String name;
    private int id;
    private double salary;

    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: $" + salary);
    }
}
