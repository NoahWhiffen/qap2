//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 9th, 2025

package tests;

import classes.Person;
import classes.Address;
import classes.Money;
import classes.CreditCard;

public class CreditCardDemo {
    public static void main(String[] args) {

        // Declare aggregated objects
        Address address = new Address("123 Main Street", "St. Johns", "NL", "A1A 1A1");
        Person person = new Person("John", "Smith", address);
        Money creditLimit = new Money(2500);

        Money chargeAmount = new Money(600);
        Money paymentAmount = new Money(1000);
        Money addedFunds = new Money(3000);
        Money takenFunds = new Money(200);
        // Declare credit card object
        CreditCard creditCard = new CreditCard(person, creditLimit);
        

        // Test getters
        System.out.println("Getters Methods");
        System.out.println("----------------------------------------");
        System.out.println("Card Holder: " + creditCard.getPersonals());
        System.out.println("Initial Card balance: " + creditCard.getBalance());
        System.out.println("Credit Limit: " + creditCard.getCreditLimit());

        creditCard.addFunds(addedFunds);
        System.out.println(addedFunds + " added to account");
        System.out.println("Balance after funds added: " + creditCard.getBalance());
        
        creditCard.subtractFunds(takenFunds);
        System.out.println(takenFunds + " withdrawal");
        System.out.println("Balance after funds withdrawn: " + creditCard.getBalance());

        // Test charge and payment methods
        System.out.println("----------------------------------------");
        System.out.println("Charging: " + chargeAmount);
        creditCard.charge(chargeAmount);
        System.out.println("Amount after charge: " + creditCard.getBalance());

        System.out.println("Payment: " + paymentAmount);
        creditCard.payment(paymentAmount);
        System.out.println("Amount after payment: " + creditCard.getBalance());
        System.out.println("----------------------------------------");
    }
}
