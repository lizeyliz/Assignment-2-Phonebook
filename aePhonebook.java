//see readme
//manager class: contains methods
import java.util.Scanner;
public class aePhonebook {
        //Create contact from user input
        public Contact createContact(Scanner scan, Contact myContact) {
            System.out.println("Enter name:");
            myContact.name = scan.nextLine();
            System.out.println("Enter phone number (XXX-XXX-XXXX):");
            myContact.phoneNum = scan.next();
            scan.nextLine();//consumes dangling newline char
            System.out.println("Enter address:");
            myContact.address = scan.nextLine();
            System.out.println("Enter city:");
            myContact.city = scan.next();
    
            return myContact;
        }//end createContact

        public void viewPhonebook() {

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