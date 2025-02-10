//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 9th, 2025

package classes;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money creditLimit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(this.balance);
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    public String getPersonals() {
        return this.owner.toString();
    }

    public void addFunds(Money amount) {
        this.balance = this.balance.add(amount);
        // System.out.println("Added funds. New balance: " + this.balance);  // Debugging statement
    }

    public void subtractFunds(Money amount) {
        this.balance = this.balance.subtract(amount);
    }

    public void charge(Money newCharge) {
        if (this.balance.compareTo(newCharge) >= 0) {
            this.balance = this.balance.subtract(newCharge);
        } else {
            throw new IllegalArgumentException("Insufficient funds.");
        }
    }

    public void payment(Money amount) {
        Money newBalance = this.balance.subtract(amount);
        this.balance = newBalance;
        // System.out.println("Payment successful. New balance: " + this.balance);  // Debugging statement
    }
}
