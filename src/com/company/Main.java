package com.company;
import java.util.*;
public class Main {

    ArrayList<Contact> persons = new ArrayList<Contact>();
    static Scanner sc = new Scanner(System.in);

    public void addContacts() {
        String firstName, lastName, address, city, zip, phoneNumber, email;
        System.out.println("Enter First Name: ");
        firstName = sc.next();
        System.out.println("Enter LastName: ");
        lastName = sc.next();
        System.out.println("Enter Address: ");
        address = sc.next();
        System.out.println("Enter city: ");
        city = sc.next();
        System.out.println("Enter zip: ");
        zip = sc.next();
        System.out.println("Enter Phone Number: ");
        phoneNumber = sc.next();
        System.out.println("Enter Email Id: ");
        email = sc.next();
        //contact class object
        Contact contact = new Contact(firstName, lastName, address, city, zip, phoneNumber, email);
        persons.add(contact);
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Main ad = new Main();
        int check;
        System.out.println("Enter Your Choice");
        check = sc.nextInt();
        switch (check) {
            case 1:
                ad.addContacts();
                break;
            default:
                System.exit(0);
        }
    }
}
