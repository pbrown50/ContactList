/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Student extends Person {
    // TODO: Modify and complete this class
    private int grade;
    public Student(String firstName, String lastName, int phoneNumber, int grade) {
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }
    public String getFirstName() {
        return getFirstName();
    }

    public String getLastName() {
        return getLastName();
    }

    public int getPhoneNumber() {
        return getPhoneNumber();
    }
    public String toString(){
        return super.toString() + "Grade: " + grade;
    }
}
