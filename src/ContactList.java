/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ContactList
{
    // TODO: Create your array contacts
    // creates arrayList for contacts
    private ArrayList<Person> contacts;
    // TODO: Write a Constructor
    // constructor initializes arrayList for contacts
    public ContactList() {
        contacts = new ArrayList<Person>();
    }
    // prints menu
    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }
    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    // adds contact to arrayList contacts
    public void addContact() {
        // TODO: Complete the addContact method
        // asks user what type of contact they want to add
        Scanner s = new Scanner(System.in);
        System.out.println("Select type of contact you would like to add:\n"
                + "1. Student\n2. Employee");
        int input = s.nextInt();
        s.nextLine();
        Person p;
        // asks for student contact information
        if (input == 1) {
            System.out.println("Please enter the following information:");
            System.out.println("First Name:");
            String firstName = s.nextLine();
            System.out.println("Last Name:");
            String lastName = s.nextLine();
            System.out.println("Phone Number:");
            String phoneNumber = s.nextLine();
            System.out.println("Grade:");
            String grade = s.nextLine();
            // creates new contact
            p = new Student(firstName, lastName, phoneNumber, grade);
            // adds contact to arrayList
            contacts.add(p);
            // prints it
            System.out.println(p+"\n");
        }
        // asks for employee contact information
        else if (input == 2) {
            System.out.println("Please enter the following information:");
            System.out.println("First Name:");
            String firstName = s.nextLine();
            System.out.println("Last Name:");
            String lastName = s.nextLine();
            System.out.println("Phone Number:");
            String phoneNumber = s.nextLine();
            System.out.println("Salary:");
            double salary = s.nextDouble();
            s.nextLine();
            // creates new contact
            p = new Employee(firstName, lastName, phoneNumber, salary);
            // adds contact to arrayList
            contacts.add(p);
            // prints it
            System.out.println(p);
        }
    }
    /**
     * Loops through and prints all contacts
     */
    // prints all contacts in arrayList
    public void printContacts() {
        // TODO: Complete the printContacts method
        // iterates through contacts and prints them
        for (Person p : contacts) {
            System.out.println(p.toString());
        }
    }
    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    // sorts contact list
    public void sort(int sortBy) {
        // TODO: Complete the sort method
        // sorts by first name
        if (sortBy == 0) {
            Person sub;
            // nested for loops to iterate through each contact and put it in correct order
            for (int i = 1; i < contacts.size(); i++) {
                for (int j = 0; j < contacts.size() - i; j++) {
                    // checks alphabetical order of first name
                    if (contacts.get(j).getFirstName().compareTo( contacts.get(j + 1).getFirstName()) > 0) {
                        // swaps indexes of contacts if not in right order
                        Collections.swap(contacts, j, j + 1);
                    }
                }
            }
        }
        // sorts by last name
        else if (sortBy == 1) {
            Person sub;
            // nested for loops to iterate through each contact and put it in correct order
            for (int i = 1; i < contacts.size(); i++) {
                for (int j = 0; j < contacts.size() - i; j++) {
                    // checks alphabetical order of last name
                    if (contacts.get(j).getLastName().compareTo(contacts.get(j + 1).getLastName()) > 0) {
                        // swaps indexes of contacts if not in right order
                        Collections.swap(contacts, j, j + 1);
                    }
                }
            }
        }
        // sorts by phone number
        else if (sortBy == 2) {
            Person sub;
            // nested for loops to iterate through each contact and put it in correct order
            for (int i = 1; i < contacts.size(); i++) {
                for (int j = 0; j < contacts.size() - i; i++) {
                    // checks to see which number value is greater
                    if (contacts.get(i).getPhoneNumber().compareTo(contacts.get(i + 1).getPhoneNumber()) > 0) {
                        // swaps indexes of contacts if not in right order
                        Collections.swap(contacts, j, j + 1);
                    }
                }
            }
        }
    }
    // TODO: Write searchByFirstName
    // searches for contact in list using first name
    public Person searchByFirstName(String firstName) {
        // iterates through contact list
        for (Person p : contacts) {
            // if first name is present in list, that contact is returned
            if (firstName.equals(p.getFirstName())) {
                return p;
            }
        }
        // if name is not present in list, null is returned
        return null;
    }
    // TODO: Write searchByLastName
    // searches for contact in list using last name
    public Person searchByLastName(String lastName) {
        // iterates through contact list
        for (Person p : contacts) {
            // if last name is present in list, that contact is returned
            if (lastName.equals(p.getLastName())) {
                return p;
            }
        }
        // if name is not present in list, null is returned
        return null;
    }
    // TODO: Write searchByPhoneNumber
    // searches for contact in list using phone number
    public Person searchByPhoneNumber(String phoneNumber) {
        // iterates through contact list
        for (Person p : contacts) {
            // if the phone number is present in list, that contact is returned
            if (phoneNumber.equals(p.getPhoneNumber())) {
                return p;
            }
        }
        // if number is not present in list, null is returned
        return null;
    }
    /**
     * Lists just the Student objects in the Contact List
     */
    // prints all the student contacts in list
    public void listStudents() {
        // TODO: Complete the listStudents method
        // iterates through contact list
        for (Person p : contacts) {
            // prints contact if they are a student
            if (p instanceof Student) {
                System.out.println(p);
            }
        }
    }
    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    // runs the program
    public void run() {
        // prints instructions
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");

        // TODO: Complete the run method
        Scanner s = new Scanner(System.in);
        int i;
        // do while loop continues to prompt user with options until program is exited by selecting 0
        do {
            // prints menu options
            printMenuOptions();
            // i holds user selection from menu
            i = s.nextInt();
            s.nextLine();
            // ran if user selected given number
            if (i == 1) {
                // runs add contact method
                addContact();
            }
            else if (i == 2) {
                // sorts contact list by first name
                sort(0);
                // prints contact list
                printContacts();
            }
            else if (i == 3) {
                // sorts contact list by last name
                sort(1);
                // prints contact list
                printContacts();
            }
            else if (i == 4) {
                // sorts contact list by phone number
                sort(2);
                // print contact list
                printContacts();
            }
            else if (i == 5) {
                // prints all students in contact list
                listStudents();
            }
            else if (i == 6) {
                // prompts user for name
                System.out.println("Enter a name:");
                String input = s.nextLine();
                // searches for name in contact list
                // if found contact is printed
                if(searchByFirstName(input) != null) {
                    System.out.println(searchByFirstName(input));
                }
                // if not found message is displayed
                else {
                    System.out.println(input + " is not in the list.");
                }
            }
            else if (i == 7) {
                // promts user for name
                System.out.println("Enter a name:");
                String input = s.nextLine();
                // searches for name in contact list
                // if found contact is printed
                if (searchByLastName(input) != null) {
                    System.out.println(searchByLastName(input));
                }
                // if not found message is displayed
                else {
                    System.out.println(input + " is not in the list.");
                }
            }
            else if (i == 8) {
                // prompts user for phone number
                System.out.println("Enter a phone number:");
                String input = s.nextLine();
                // searches for number in contact list
                // if found contact is printed
                if (searchByPhoneNumber(input) != null) {
                    System.out.println(searchByPhoneNumber(input));
                }
                // if not found message is displayed
                else {
                    System.out.println(input + " is not in the list.");
                }
            }
            // program is ended if user inputs 0
        } while (i != 0);

    }
    public static void main(String[] args)
    {
        // initialized contact list
        ContactList cl = new ContactList();
        // runs program
        cl.run();
    }
}
