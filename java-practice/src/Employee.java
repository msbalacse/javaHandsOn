public class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public boolean lessThan(Employee other) {
        return salary < other.salary;
    }

    public boolean greaterThan(Employee other) {
        return salary > other.salary;
    }

    public Employee add(Employee other) {
        return new Employee("Combined", salary + other.salary);
    }

    public Employee subtract(Employee other) {
        return new Employee("Difference", salary - other.salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 5000);
        Employee emp2 = new Employee("Bob", 12000);

        if (emp1.lessThan(emp2)) {
            System.out.println("Bob has a higher salary than Alice.");
        } else {
            System.out.println("Alice has a higher salary than Bob.");
        }

        Employee combined = emp1.add(emp2);
        System.out.println("Combined Salary: " + combined.getSalary());

        Employee difference = emp1.subtract(emp2);
        System.out.println("Salary Difference: " + difference.getSalary());
    }
}