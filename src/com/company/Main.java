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

    public void editContact(){
        System.out.println("Enter First Name: ");
        String checkFirstName = sc.next();      // Take Name From User To Check
        boolean flag = false;
        for(Contact contact : persons) {

            if (contact.firstName.equals(checkFirstName)) //check Name Equals
            {
                flag = true;
                System.out.println("1. First Name\n"+"2.Last Name\n"+"3.Address\n"+"4.city\n"+"5.zip\n"+"6.phoneNumber\n"+"7.email");
                int choice = sc.nextInt(); //take choice for edit

                switch (choice) {

                    case 1:
                        System.out.println("Enter First Name : ");
                        String firstName = sc.next();
                        contact.firstName = firstName;
                        break;
                    case 2:
                        System.out.println("Enter First Name : ");
                        String lastName = sc.next();
                        contact.lastName = lastName;
                        break;
                    case 3:
                        System.out.println("Enter Address : ");
                        String address = sc.next();
                        contact.address = address;
                        break;
                    case 4:
                        System.out.println("Enter city : ");
                        String city = sc.next();
                        contact.city = city;
                        break;
                    case 5:
                        System.out.println("Enter zip : ");
                        String zip = sc.next();
                        contact.zip = zip;
                        break;
                    case 6:
                        System.out.println("Enter phone Number : ");
                        String phoneNumber = sc.next();
                        contact.phoneNumber = phoneNumber;
                        break;
                    case 7:
                        System.out.println("Enter email : ");
                        String email = sc.next();
                        contact.email = email;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
                break;
            }
        }
        if(flag == false){
                System.out.println(checkFirstName + " Not Found!");
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Main ad = new Main();
            System.out.println("1. Add\n2. Edit\n");
            int check;
            System.out.println("Enter Your Choice");
            check = sc.nextInt();
            switch (check) {
                case 1:
                    ad.addContacts();//Add method call
                    break;
                case 2:
                    ad.editContact();//edit Method call
                    break;
                default:
                    System.exit(0);
            }
    }
}
