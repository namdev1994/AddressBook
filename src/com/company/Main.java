package com.company;
class Contact
{
    String firstName;
    String lastName;
    String address;
    String city;
    String zip;
    String phoneNumber;
    String email;
    //constructor
    public Contact(String firstName, String lastName, String address, String city, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    //method implementation
    public void displayAddress() {
        System.out.println(firstName + " \t " + lastName + " \t " + address + " \t " + city + " \t " + zip + " \t " + phoneNumber + " \t " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        //object creation
        Contact c1=new Contact("namdev","lavhare","pattiwadagon","beed","431519","8600060359","namdev1994@gamil.com");
        //method call
        c1.displayAddress();
    }
}
