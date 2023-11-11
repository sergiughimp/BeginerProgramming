package oop;
// oop = object-oriented programming
// class = template for the object (class Car)
// object = instance of a class (5 objects type Car)

// fields = proprieties = attributes
// variables (The car has: color, brand, price)

// methods = functions in oop

public class BankAccount {

//    proprieties
    String accountHolder;
    String iban;
    double sold = 0;
    boolean active = false;
    private int pin = 7777;
    int tries_activate = 0;

//    constructors = used to initialize the objects
    public BankAccount(String accountHolder, String iban) {
        this.accountHolder = accountHolder;
        this.iban = iban;
    }

//    methods
    public void describeSold(){
        System.out.println(this.accountHolder);
        System.out.println(this.iban);
        System.out.println(this.sold);
        System.out.println(this.active);
        System.out.println("Number of wrong tries " + this.tries_activate);
    }

    public void activateAccount(int pinUser){
        // modify to active only if the pin is correct
        if (pinUser == this.pin) {
            this.active = true;
            System.out.println("The card was activated with success");
        } else {
            System.out.println("The pin is wrong");
            this.tries_activate++; // increment tries_activate
        }
    }

    public void topUpCard(double amount_topUp){
        // the amount that we have in account + amount_topUp
        this.sold = this.sold + amount_topUp;
        System.out.println("Top up with success the amount of "+ amount_topUp + " You have in your account the amount of: " + this.sold);
    }

    public void withdraw(double amount_withdraw){
        // we can withdraw only what I have in account
        if (amount_withdraw <= this.sold){
            this.sold = this.sold - amount_withdraw;
            System.out.println("You have in account  " + this.sold);
        } else {
            System.out.println("Insufficient fonds");
        }
    }

//    4 principles of oop
    // inheritance
    // polymorphism
    // encapsulation
    // abstraction
}
