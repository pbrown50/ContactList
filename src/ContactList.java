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
public class ContactList
{
    // TODO: Create your array contacts
    private ArrayList<Person> contacts;
    // TODO: Write a Constructor
    public ContactList() {
        contacts = new ArrayList<Person>();
    }
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
    public void addContact(Person p) {
        // TODO: Complete the addContact method
        contacts.add(p);
    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        // TODO: Complete the printContacts method
        for (Person p : contacts) {
            System.out.println(p.toString());
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // TODO: Complete the sort method
        //sorts by first name
        if (sortBy == 0) {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getFirstName().compareTo(contacts.get(i + 1).getFirstName()) == 1 && (i != contacts.size() - 1)) {
                    Person sub = contacts.get(i);
                    contacts.add(i, contacts.remove(i + 1));
                    contacts.add(i + 1, sub);
                }
            }
        }
        //sorts by last name
        else if (sortBy == 1) {
            if (sortBy == 0) {
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).getLastName().compareTo(contacts.get(i + 1).getLastName()) == 1 && (i != contacts.size() - 1)) {
                        Person sub = contacts.get(i);
                        contacts.add(i, contacts.remove(i + 1));
                        contacts.add(i + 1, sub);
                    }
                }
            }
        }
        //sorts by phone number
        else if (sortBy == 2) {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getPhoneNumber() > contacts.get(i + 1).getPhoneNumber() && i != contacts.size() - 1) {
                    Person sub = contacts.get(i);
                    contacts.add(i, contacts.remove(i + 1));
                    contacts.add(i + 1, sub);
                }
            }
        }
    }

    // TODO: Write searchByFirstName

    // TODO: Write searchByLastName

    // TODO: Write searchByPhoneNumber

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        // TODO: Complete the listStudents method
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        printMenuOptions();

        // TODO: Complete the run method
    }


    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}
