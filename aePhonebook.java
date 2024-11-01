//see readme
//manager class: contains methods (LinkedList)
//start with add, delete, and display (modify is harder)
//add at end and add at index method?
import java.util.*;
public class aePhonebook {
        Contact head; //will point to first contact
        Contact tail; //will point to last contact
        int size = 0;

        //first and last?

        //constructor
        public aePhonebook() {
            this.head = null; //initializes head to null so we can add
            this.tail = null;
        }//end constructor

        //Create contact from user input
        public Contact createContact(Scanner scan, Contact myContact) {
            System.out.println("add contact (press enter)");//may remove later
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
            if (head == null) { //if linked list is empty, newContact is head of list
                head = newContact; 
            } else { //if linked list isn't empty
                Contact current = head; //starting from beginning of linked list
                while(current.next != null) { //while current isn't pointing to null
                    current = current.next; //move to next contact in linked list
                }//end while loop
                current.next = newContact; //add new contact to end of list (where null is)
            }//end if/else
            size++;
        }//end addContact

        //add contact at index
        public void addAtIndex(int index, Contact newContact) {
            //add at beginning
            if (index == 0) {
                newContact.next = head;
                head = newContact;
            } else {
                //start from beginning of linked list
                Contact current = head;
                //move through linked list up to two before index
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }//end for loop
                newContact.next = current.next;
                current.next = newContact;
            }//end if/else
        }//end addAtIndex

        //modify a contact (add scanner)
        //need to modify the next reference of node BEFORE the place you want to change
        //delete element and add back in new element at index?
        //need to use doubly linked list to modify
        public void modify(int index) {
            //List contacts with index #s by them
            //System.out.println("Which contact would you like to modify?"); in user menu
            //special case for if contact you want to change is head (index 0)
            Contact newContact = new Contact("Modify","206-546-8900", "2650 Nowhere St", "Bellingham");
            //add contact to head currently
            if (index == 0) {
                newContact.next = head;
            } else {
                Contact current = head;
            //go through linked list to spot two before index
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            } //end for loop
            //changing the next reference for contact BEFORE one you want to change
            newContact = current.next; //link new contact to rest of list after
            current.next = newContact;
            //get contact after
            //newContact.next = get(index + 1);
            }//end if/else
            //now need to connect back to rest of list, currently cuts off at spot modified
            //add back contacts after this index
            //doubly vs singly linked list


        }//end modify

        //delete a contact
        //from slide 50 linked list
        public void delete(int index) {
            if (index == 0) {//special case, removing first element
                head = head.next; //next element is new head
            } else {
                Contact current = head;
                //go through array list up to element 2 before index
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }//end for loop
                //taking element before the one we want to delete, 
                //connecting it to element after the one we want to delete
                current.next = current.next.next;
            }//end if/else
            size--;
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