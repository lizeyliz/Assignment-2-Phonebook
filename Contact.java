//see read me
//object class
//a single list note representing one contact in phonebook
//currently not making data private (couldn't figure out) will come back to
public class Contact {
   //instance variables
   String name;
   String phoneNum;
   String address;
   String city; //not sure if I want this field

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
