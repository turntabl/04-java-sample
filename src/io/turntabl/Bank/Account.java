package io.turntabl.Bank;

public class Account {
    private int balance;
    private int accountNumber;

    public Account(int balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int value){
        balance += value;
    }

    public void withdraw(int value){
        balance -= value;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
