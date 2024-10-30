//see readme
//manager class: contains methods (LinkedList)
//start with add, delete, and display (modify is harder)
//add at end and add at index method?
import java.util.Scanner;
public class aePhonebook {
        Contact head; //points to first element?

        //constructor
        public aePhonebook() {
            this.head = null; //initializes head to null so we can add
        }//end constructor

        //Create contact from user input
        public Contact createContact(Scanner scan, Contact myContact) {
            scan.nextLine();//consumes dangling newline char
            System.out.println("Enter name:");
            myContact.setName(scan.nextLine());
            System.out.println("Enter phone number (XXX-XXX-XXXX):");
            myContact.setPhoneNum(scan.next());
            scan.nextLine();//consumes dangling newline char
            System.out.println("Enter address:");
            myContact.setAddress(scan.nextLine());
            System.out.println("Enter city:");
            myContact.setCity(scan.next());

            System.out.println();
    
            return myContact;
        }//end createContact

        //import contact from createContact (myContact)
        //add contact to end of list
        public void addContact(Contact contact) {
            Contact newContact = contact;
            if (head == null) { //if head is empty, add contact
                head = newContact; 
            } else { //if head isn't empty
                Contact current = head; //starting from beginning of linked list
                while(current.next != null) { //while current isn't pointing to null
                    current = current.next; //move to next contact in linked list
                }//end while loop
                current.next = newContact; //add new contact to end of list
            }//end if/else
        }//end addContact

        //modify a contact
        public void modify(Contact contact) {
            Contact current = head; //put outside of method bc used in all methods?
            //but needs to reset every time

        }//end modify

        //delete a contact
        public void delete(Contact contact) {

        }//end delete

        //print contacts
        public void viewPhonebook() {
            Contact current = head; //start from beginning of linked list
            while (current != null) {
                System.out.println(current.toString());
                current = current.next; //move to next in list
            }//end while loop
            System.out.println();

        } //end viewPhonebook

        //user menu
        public void userMenu(int userInt) {
            switch (userInt) {
                case 1 -> { //create a contact
                    System.out.println("Create a contact");
                } case 2 -> { //view phonebook
                    System.out.println("View phonebook");
                } case 3 -> { //modify a contact
                    System.out.println("Modify a contact");
                } case 4 -> {//delete a contact
                    System.out.println("Delete a contact");
                } case 5 -> {//quit
                    //nothing happens here
                } default -> { //initialized to this and will show if wrong input is typed
                    System.out.println("Enter a number between 1-5.");
                }
            }//end switch/case

            //print options
            System.out.println("1) Create a new contact");
            System.out.println("2) View phonebook");
            System.out.println("3) Modify a contact");
            System.out.println("4) Delete a contact");
            System.out.println("5) Quit");
        }//end userMenu
}//end aePhonebook