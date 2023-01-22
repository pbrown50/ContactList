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
    // declares instance variables
    private String firstName;
    private String lastName;
    private String phoneNumber;
    // constructor initializes instance variables
    public Person(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    // returns first name
    public String getFirstName() {
        return firstName;
    }
    // returns last name
    public String getLastName() {
        return lastName;
    }
    // returns phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // to string for Person
    public String toString(){
        return firstName + " " + lastName + " - #" + phoneNumber;
    }
}
