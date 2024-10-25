import java.util.Scanner;
public class aePhonebookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contact p1 = new Contact();
        Contact p2 = new Contact();
        System.out.println(p2.toString());

        //Create contact from user input (for p1)
        System.out.println("Enter name:");
        p1.name = scan.nextLine();
        scan.nextLine();//cosumes dangling newline char
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