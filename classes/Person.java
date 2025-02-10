//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 9th, 2025

package classes;

public class Person {
    private String lastName;
    private String firstName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + address;
    }
}
