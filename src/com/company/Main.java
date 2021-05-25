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
            System.out.println("1: Add new address book\n2: search persons by city name\n3: searchPersonsByState" +
                    "\n4: exit");
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
                case 4:
                    System.out.println("Enter Name of State: ");
                    String stateName = sc.next();
                    Main.searchPersonByState(stateName);
                    break;
                case 5:
                    System.out.println("Enter Name of State: ");
                    String stateName1 = sc.next();
                    Main.viewPersonByStateUsingHashmap(stateName1);
                    break;
                case 6:
                    System.out.println("Enter Name of City: ");
                    String cityName1 = sc.next();
                    Main.viewPersonByCityUsingHashMap(cityName1);
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }
    }

    private static void viewPersonByCityUsingHashMap(String cityName1) {
        for (Map.Entry<String, AddressBook> entry : addressBookList.entrySet()) {
            AddressBook value = entry.getValue();
            ArrayList<Contact> contacts = value.personByCity.entrySet().stream().filter(findCity -> findCity.getKey().equals(cityName1)).map(Map.Entry::getValue).findFirst().orElse(null);
            for(Contact contact: contacts){
                System.out.println("First Name: "+contact.firstName+" Last Name: "+ contact.lastName);
            }
        }
    }


    private static void viewPersonByStateUsingHashmap(String stateName1) {
        for (Map.Entry<String, AddressBook> entry : addressBookList.entrySet()) {
            AddressBook value = entry.getValue();
            ArrayList<Contact> contacts = value.personByState.entrySet().stream().filter(findState -> findState.getKey().equals(stateName1)).map(Map.Entry::getValue).findFirst().orElse(null);
            for(Contact contact: contacts){
                System.out.println("First Name: "+contact.firstName+" Last Name: "+ contact.lastName);
            }
        }
    }

    private static void searchPersonByState(String state) {
        for(Map.Entry<String,AddressBook> entry: addressBookList.entrySet()){
            AddressBook value = entry.getValue();
            System.out.println("The Address Book: "+entry.getKey());
            value.getPersonNameByState(state);
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

