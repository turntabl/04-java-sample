package io.turntabl.Bank;

import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
