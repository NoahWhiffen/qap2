//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Date: February 9th, 2025

package classes;

public class Money {
  private long dollars;
  private long cents;

  public Money(double amount) {
    this.dollars = (long) amount;
    this.cents = Math.round((amount - this.dollars) * 100);
  }

  public Money (Money otherObject) {
    this.dollars = otherObject.dollars;
    this.cents = otherObject.cents;
  }

  public Money add(Money otherObject) {
    long totalCents = this.dollars * 100 + this.cents + otherObject.dollars * 100 + otherObject.cents;
    return new Money(totalCents / 100.0);
}

  public Money subtract(Money otherObject) {
    long totalCents = this.dollars * 100 + this.cents - (otherObject.dollars * 100 + otherObject.cents);
    return new Money(totalCents / 100.0);
}

  public int compareTo(Money otherObject) {
    long totalCents = this.dollars * 100 + this.cents;
    long otherTotalCents = otherObject.dollars * 100 + otherObject.cents;
    return Long.compare(totalCents, otherTotalCents); // returns -1 if totalCents < otherTotalCents, 0 if equal, 1 if totalCents > otherTotalCents
  }

  public boolean equals(Money otherObject) {
    return (this.dollars == otherObject.dollars) && (this.cents == otherObject.cents);
  }

  public String toString() {
    return String.format("$%d.%02d", this.dollars, this.cents);
  }
}
