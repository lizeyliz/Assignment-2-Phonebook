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

        //test add contact method
        myPhoneBook.addContact(p1);
        myPhoneBook.addContact(p2);
        myPhoneBook.addContact(p3);

        myPhoneBook.viewPhonebook();

        //test size method
        System.out.println("Number of contacts = " + myPhoneBook.size);

        //test delete method (delete p2)
        myPhoneBook.delete(0);
        myPhoneBook.viewPhonebook();
        System.out.println("Number of contacts = " + myPhoneBook.size);


    }//end main
    
}//end aePhonebookTest