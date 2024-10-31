import java.util.Scanner;
public class aePhonebookTest {
    public static void main(String[] args) {
        //create a phonebook object
        aePhonebook myPhoneBook = new aePhonebook();
        Scanner scan = new Scanner(System.in);
        //test user menu
        /*int userInt = 0; //initialize to invalid input to give instructions
        do {  //loop user menu
            myPhoneBook.userMenu(userInt);
            //get user input
            userInt = scan.nextInt();
        } while (userInt != 5);
        System.out.println("Goodbye!");*/

        //test: Print two contacts
        Contact p1 = new Contact("Harry Potter", "206-682-7855", "12 Grimmauld Place",
        "London");
        Contact p2 = new Contact("John Doe", "206-574-6779", "1479 Harris Ave", 
        "Bellingham");
        Contact p3 = new Contact("Jane Santiago", "206-555-7464", "1900 Maple St", "Seattle");
        Contact p4 = new Contact("Harold Green", "206-767-8321", "1320 Oak St", "Bellingham");

        //test add contact method
        myPhoneBook.addContact(p1);
        myPhoneBook.addContact(p2);
        myPhoneBook.addContact(p3);
        myPhoneBook.addContact(p4);

        myPhoneBook.viewPhonebook();

        //test modify method
        //modify at index 0
        System.out.println("Modify at index 1:");
        myPhoneBook.modify(1);
        myPhoneBook.viewPhonebook();
    }//end main
    
}//end aePhonebookTest