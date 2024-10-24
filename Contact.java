//see read me
//object class
//a single list note representing one contact in phonebook
public class Contact {
    //instance variables
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String address;
    private String city; //not sure if I want this field

    //constructor
    public Contact (String firstName, String lastName, String phoneNum, String address, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.address = address;
        this.city = city;
    } //end constructor
 
    //put contact into presentable form
    public String toString() {
        String contactString = firstName + " " + lastName + "\n"
        + phoneNum + "\n" + address + "\n" + city + "\n";
        return contactString;
    }//end toString
}
