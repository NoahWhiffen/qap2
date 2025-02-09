//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 9th, 2025

package classes;

public class MyCreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public MyCreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        this.balance = balance.add(amount);
    }

    public void payment(Money amount) {
        this.balance = balance.subtract(amount);
    }
}
