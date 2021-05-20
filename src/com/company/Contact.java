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
    public String toString()
    {
        return firstName+"\t"+lastName+"\t"+address+"\t"+city+"\t"+zip+"\t"+phoneNumber+"\t"+email;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        final Contact contact = (Contact) obj;
        if (this == contact) {
            return true;
        } else {
            return (this.firstName.equals(contact.firstName));
        }
    }
    @Override
    public int hashCode() {
        int hashno = 7;
        hashno = 13 * hashno + (firstName == null ? 0 : firstName.hashCode());
        return hashno;
    }
}
