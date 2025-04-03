class Employee {
    private String empId;
    private double salary;

    // Getter and Setter methods
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive");
        }
    }
}

public class Encap2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId("E123");
        emp.setSalary(50000);
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
