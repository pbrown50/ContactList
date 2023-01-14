public class Employee extends Person {
    private double salary;
    public Employee(String firstName, String lastName, int phoneNumber, double salary) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        return super.toString() + "Salary: " + salary;
    }
}
