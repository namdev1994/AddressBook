package com.company;

public class Contact {

    String firstName,lastName,address,city,email,phoneNumber;
    int zip;
    public Contact(String firstName, String lastName, String address, String city, int zip, String phoneNumber, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
