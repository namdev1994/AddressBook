package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {

    static ArrayList<Contact> temppersons = new ArrayList<Contact>();
    static ArrayList<Contact> persons = new ArrayList<Contact>();
    public static Map<String, ArrayList<Contact>> addressBookList = new HashMap<String, ArrayList<Contact>>();
    static Scanner sc = new Scanner(System.in);
    public HashMap<String, ArrayList<Contact>> personByState;
    public HashMap<String, ArrayList<Contact>> personByCity;


    public static void addContacts() {
        String firstName, lastName, address, city, email, phoneNumber,state;
        int zip;
        System.out.println("Enter First Name: ");
        firstName = sc.next();
        System.out.println("Enter LastName: ");
        lastName = sc.next();
        System.out.println("Enter Address: ");
        address = sc.next();
        System.out.println("Enter city: ");
        city = sc.next();
        System.out.println("Enter state: ");
        state = sc.next();
        System.out.println("Enter zip: ");
        zip = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        phoneNumber = sc.next();
        System.out.println("Enter Email Id: ");
        email = sc.next();
        //contact class object
        Contact contact = new Contact(firstName, lastName, address, city, phoneNumber, email,state,zip);
        temppersons.add(contact);
        List distelemenet= temppersons.stream().distinct().collect(Collectors.toList());
        persons = new ArrayList<Contact>(distelemenet);
        //System.out.println(persons);

    }


    public static void editContact() {
        System.out.println("Enter First Name: ");
        String checkFirstName = sc.next();      // Take Name From User To Check
        boolean flag = false;
        for (Contact contact : persons) {

            if (contact.firstName.equals(checkFirstName)) //check Name Equals
            {

                flag = true;
                System.out.println("1. First Name\n" + "2.Last Name\n" + "3.Address\n" + "4.city\n" + "5.zip\n" + "6.phoneNumber\n" + "7.email");
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
                        int zip = sc.nextInt();
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
        if (flag == false) {
            System.out.println(checkFirstName + " Not Found!");
        }

    }

    public static void deleteContact() {

        System.out.println("Enter First Name: ");
        String checkFirstName = sc.next();      // Take Name From User To Check
        boolean flag = false;
        for (Contact contact : persons) {

            if (contact.firstName.equals(checkFirstName)) //check Name Equals
            {
                flag = true;
                persons.remove(contact);   //delete contact
                break;
            }
        }
        if (flag == false) {
            System.out.println(checkFirstName + " is Not Found");
        }
    }

    public static void displayContacts() // display Contacts
    {
        int i = 1;
        for (Contact contact : persons) {
            System.out.print("Contact: " + i);
            System.out.print("\tFirst Name : " + contact.firstName);
            System.out.print("\tLast Name : " + contact.lastName);
            System.out.print("\tAddress : " + contact.address);
            System.out.print("\tCity : " + contact.city);
            System.out.print("\tzip : " + contact.zip);
            System.out.print("\tPhoane Number : " + contact.phoneNumber);
            System.out.print("\temail : " + contact.email + "\n");
            i++;
        }
    }

    public void getPersonNameByCity(String city) {
        List<Contact> list  = persons.stream().filter(p ->p.city.equals(city)).collect(Collectors.toList());
        for(Contact contact: list){
            System.out.println("First Name: "+contact.firstName);
            System.out.println("Last Name: "+contact.lastName);
        }
    }

    public void getPersonNameByState(String state) {
        List<Contact> list  = persons.stream().filter(p ->p.city.equals(state)).collect(Collectors.toList());
        for(Contact contact: list){
            System.out.println("First Name: "+contact.firstName);
            System.out.println("Last Name: "+contact.lastName);
        }
    }
    }

