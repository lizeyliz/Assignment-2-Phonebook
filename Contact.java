//see read me
//object class
//a single list note representing one contact in phonebook

public class Contact {
   //instance variables
   private String name;
   private String phoneNum;
   private String address;
   private String city; //not sure if I want this field

   //pointing to next node
   Contact next; //not sure what this does, apparently used to stop entries,
   //first, last Contact variables?
   //int for size?

   //getters and setters

   public String getName() {
        return name;
   }//end getName

   public void setName(String newName) {
        this.name = newName;
   }//end setName

   public String getPhoneNum() {
        return phoneNum;
   }// end getPhoneNum

   public void setPhoneNum(String newPhoneNum) {
        this.phoneNum = newPhoneNum;
   }//end setPhoneNum

   public String getAddress() {
        return address;
   }//end getAddress

   public void setAddress(String newAddress) {
        this.address = newAddress;
   }// end setAddress

   public String getCity() {
        return city;
   }//end getCity

   public void setCity(String newCity) {
        this.city = newCity;
   }//end setCity

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
}//end class Contact
