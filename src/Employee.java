public class Employee extends Person {
    // declares salary instance variable
    private double salary;
    // constructor initializes attributes
    public Employee(String firstName, String lastName, String phoneNumber, double salary) {
        // attributes initialized in superclass
        super(firstName, lastName, phoneNumber);
        // salary initialized in this class
        this.salary = salary;
    }
    // returns salary
    public double getSalary() {
        return salary;
    }
    // to string method for employee
    public String toString() {
        return super.toString() + " Salary: " + salary;
    }
}
