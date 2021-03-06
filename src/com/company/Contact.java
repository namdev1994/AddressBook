package com.company;

public class Contact {

    String firstName,lastName,address,city,email,phoneNumber,state;
    int zip;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Contact(String firstName, String lastName, String address, String city, String email, String phoneNumber, String state, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.zip = zip;
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
            return (this.getFirstName().equals(contact.getFirstName()));
        }
    }
    @Override
    public int hashCode() {
        int hashno = 7;
        hashno = 13 * hashno + (getFirstName() == null ? 0 : getFirstName().hashCode());
        return hashno;
    }
}
