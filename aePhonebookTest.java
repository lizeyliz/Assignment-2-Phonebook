import java.util.Scanner;
public class aePhonebookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //test
        Contact p1 = new Contact("Harry Potter", "206-682-7855", "12 Grimmauld Place",
        "London");
        Contact p2 = new Contact("John Doe", "206-574-6779", "1479 Harris Ave", 
        "Bellingham");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Contact p3 = new Contact(null, null, null, null);

        createContact(scan, p3);
        System.out.println();
        System.out.println(p3.toString());
    }//end main

    //Create contact from user input
    public static Contact createContact(Scanner scan, Contact myContact) {
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

    //user menu
    public void userMenu(){
        System.out.println("Welcome to the phonebook!");
        System.out.println("Please input a number 1-4:");
        System.out.println("1) Create a new contact");
        System.out.println("2) View phonebook");
    }
    
}//end aePhonebookTest