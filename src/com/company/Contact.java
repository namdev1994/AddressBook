package com.company;

public class Contact {
    String firstName,lastName,address,city,zip,phoneNumber,email;
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
    public String toString()
    {
        return firstName+"\t"+lastName+"\t"+address+"\t"+city+"\t"+zip+"\t"+phoneNumber+"\t"+email;
    }
}
