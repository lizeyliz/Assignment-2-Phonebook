//see read me
//object class
//a single list note representing one contact in phonebook
//currently not making data private (couldn't figure out) will come back to
//getter and setter for each variable (only give access to what you need for security)
public class Contact {
   //instance variables
   String name;
   String phoneNum;
   String address;
   String city; //not sure if I want this field

   //pointing to next node
   Contact next; //not sure what this does, apparently used to stop entries,

    //constructor
    public Contact (String name, String phoneNum, String address, String city) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.city = city;
    } //end constructor

    //put contact into presentable form
    public String toString() {
        String contactString = name + "\n" + phoneNum + "\n" + address + "\n" + city + "\n";
        return contactString;
    }//end toString
}
