import java.util.Scanner;
public class aePhonebookTest {
    public static void main(String[] args) {
        aePhonebook myPhoneBook = new aePhonebook(); //create a phonebook object
        Scanner scan = new Scanner(System.in); //adding user input capabilities

        //adding three contacts to phonebook
        Contact p2 = new Contact("John Doe", "206-574-6779", "1479 Harris Ave", 
        "Bellingham");
        Contact p3 = new Contact("Jane Santiago", "206-555-7464", "1900 Maple St", "Seattle");
        Contact p4 = new Contact("Harold Green", "206-767-8321", "1320 Oak St", "Bellingham");
        myPhoneBook.addContact(p2);
        myPhoneBook.addContact(p3);
        myPhoneBook.addContact(p4);

        //user menu
        int userInt = 0; //initialize to invalid input to give instructions
        do {  //loop user menu
            myPhoneBook.userMenu(userInt, scan);
            //get user input
            userInt = scan.nextInt();
        } while (userInt != 5);
        System.out.println("Goodbye!");
    }//end main
}//end aePhonebookTest