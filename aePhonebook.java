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
            scan.nextLine();//cosumes dangling newline char
            System.out.println("Enter address:");
            myContact.address = scan.nextLine();
            System.out.println("Enter city:");
            myContact.city = scan.next();
    
            return myContact;
        }
}