from oop.bank_account import BankAccount

account1 = BankAccount("Michael", "RO001")
account2 = BankAccount("Eva", "RO002")

# call method that activates the account
account1.activeAccount(7777)
account2.activeAccount(3333)
account2.activeAccount(4444)
account2.activeAccount(7777)

# supply account
account1.supplyAccount(852.20)
account2.supplyAccount(352.20)

# # positive testing (exact amount)
# account1.withdrawMoney(852.20)

# negative testing(spend more than we have)
account2.withdrawMoney(500)

# positive testing
account1.withdrawMoney(320)
account1.withdrawMoney(50)

# call method that describes the account
account1.describeAccount()
account2.describeAccount()