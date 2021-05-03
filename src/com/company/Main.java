package com.company;
import java.util.*;
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
class AddressBook
{
    //Arraylist Object
    ArrayList contacts;
    Scanner sc=new Scanner(System.in);
    //Constructor
    public AddressBook()
    {
        contacts=new ArrayList();
    }

    // method Implementation for New Contacts
    public void addContacts()
    {
        System.out.println("Enter First Name: ");
        String firstName=sc.nextLine();
        System.out.println("Enter First LastName: ");
        String lastName=sc.nextLine();
        System.out.println("Enter Address: ");
        String address=sc.nextLine();
        System.out.println("Enter city: ");
        String city=sc.nextLine();
        System.out.println("Enter zip: ");
        String zip=sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber=sc.nextLine();
        System.out.println("Enter Email Id: ");
        String email=sc.nextLine();
        //contact class object
        Contact c=new Contact(firstName,lastName,address,city,zip,phoneNumber,email);
        //contact class object store in Arraylist
        contacts.add(c);
        // display the new Added Contact information
        c.displayAddress();

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        //object of AddressBook Class
        AddressBook ad=new AddressBook();
        Scanner sc =new Scanner(System.in);
        int check;
        System.out.println("Enter Your Choice");
        check=sc.nextInt();
        switch(check)
        {
            case 1:
                ad.addContacts();
                break;
            default:
                System.exit(0);
        }
    }
}
