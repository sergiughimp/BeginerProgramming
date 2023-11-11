package oop;
public class MainBankAccount {
    public static void main(String[] args) {
        // initialization objects type of BankAccount
        BankAccount account1 = new BankAccount("Michael Jordan", "1234");
        BankAccount account2 = new BankAccount("Daniel Peterson", "1235");

        // describe accounts
//        account1.describe();
//        account2.describe();

        // activate accounts
        account1.activateAccount(7777);
        account2.activateAccount(3333);
        account2.activateAccount(4444);
        account2.activateAccount(7777);

        // topUp account
        account1.topUpCard(399);
        account2.topUpCard(350);

        // negative testing, withdraw more that we have. from account1
        account1.withdraw(500);

        // positive testing, withdraw exact amount. from account1
        account1.withdraw(399);

        // positive testing, withdraw from account2
        account2.withdraw(50);
        account2.withdraw(300);

        // describe accounts
        account1.describeSold();
        account2.describeSold();
    }
}
