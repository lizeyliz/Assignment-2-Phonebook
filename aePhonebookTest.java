import java.util.Scanner;
public class aePhonebookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contact p1 = new Contact(null, null, null, null, null);
        Contact p2 = new Contact("Harry", "Potter", "206-676-8831", 
        "#12 Grimmauld Place", "London");
        System.out.println(p2.toString());

        //Create contact from user input (for p1)
        System.out.println("Enter first name:");
        p1.firstName = scan.next();
        System.out.println("Enter last name");
        p1.lastName = scan.next();
        System.out.println("Enter phone number (XXX-XXX-XXXX):");
        p1.phoneNum = scan.next();
        scan.nextLine();//cosumes dangling newline char
        System.out.println("Enter address:");
        p1.address = scan.nextLine();
        System.out.println("Enter city:");
        p1.city = scan.next();

        //print p1
        System.out.println();
        System.out.println(p1.toString());

    }//end main

    //user menu
    public void userMenu(){
        System.out.println("Welcome to the phonebook!");
        System.out.println("Please input a number 1-4:");
        System.out.println("1) Create a new contact");
        System.out.println("2) View phonebook");
    }
    
}//end aePhonebookTest