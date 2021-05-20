package com.company;
import java.util.*;

public class Main {
    private static AddressBook addressBook = new AddressBook();
    static Scanner sc = new Scanner(System.in); //initializing scanner class
    public static Map<String, AddressBook> addressBookList = new HashMap<String, AddressBook>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        boolean flag = true;
        while (flag) {
            System.out.println("1: Add new address book\n2: search persons by city name\n3: exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the Name of the address book");
                    String addressBookName = sc.next();
                    if (addressBookList.containsKey(addressBookName)) {
                        System.out.println("This address book is already Present ");
                    } else {
                        addAddressBook(addressBookName);//storing address book in map
                        break;

                    }
                case 2:
                    System.out.println("Enter Name of City: ");
                    String cityName = sc.next();
                    Main.searchPersonByCity(cityName);
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }

    private static void searchPersonByCity(String city) {
        for(Map.Entry<String,AddressBook> entry: addressBookList.entrySet()){
            AddressBook value = entry.getValue();
            System.out.println("The Address Book: "+entry.getKey());
            value.getPersonNameByCity(city);
        }
    }

    private static void addAddressBook(String addressBookName) {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Add\n2. Edit\n3. Delete\n4. Exit");
            int check;
            System.out.println("Enter Your Choice");
            check = sc.nextInt();
            switch (check) {
                case 1:
                    addressBook.addContacts();
                    addressBook.displayContacts();
                    break;
                case 2:
                    addressBook.editContact();
                    addressBook.displayContacts();
                    break;
                case 3:
                    addressBook.deleteContact();
                    addressBook.displayContacts();
                    break;
                case 4:
                    addressBook.displayContacts();
                    flag = false;
                    break;
                default:
                    System.out.println("Enter valid number");
                    break;
            }
        }
        addressBookList.put(addressBookName, addressBook);
        System.out.println("Address Book Added Successfully");
    }
}

