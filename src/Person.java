/**
 * A class that represents a Person
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Person {
    // TODO: Complete the Person class
    private String firstName;
    private String lastName;
    private int phoneNumber;
    public Person(String firstName, String lastName, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhonenumber() {
        return phoneNumber;
    }
    public String toString(){
        return firstName + " " + lastName + " - #" + phoneNumber;
    }
}
