//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 9th, 2025

package classes;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString() {
        return street + " " + city + " " + state + " " + zip;
    }

}
