package io.turntabl.Bank;

public class Account {
    private int balance;
    private int accountNumber;
    private AccountType type;

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", type=" + type +
                '}';
    }

    public AccountType getType() {
        return type;
    }

    public Account(int balance, int accountNumber, AccountType type){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int value){
        balance += value;
    }

    public void withdraw(int value){
        if(type == AccountType.FIXED_DEPOSIT){
            return;
        }else {
            balance -= value;
        }
    }

}
