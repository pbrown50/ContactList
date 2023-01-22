/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */
// subclass of person
public class Student extends Person {
    // TODO: Modify and complete this class
    // declares grade instance variable
    private String grade;
    // constructor initializes instance variables
    public Student(String firstName, String lastName, String phoneNumber, String grade) {
        // initializes attributes in superclass
        super(firstName, lastName, phoneNumber);
        // initializes attribute in this class
        this.grade = grade;
    }
    // returns first name
    public String getFirstName() {
        return super.getFirstName();
    }
    // returns last name
    public String getLastName() {
        return super.getLastName();
    }
    // returns phone number
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }
    // to string for student
    public String toString(){
        return super.toString() + " Grade: " + grade;
    }
}
