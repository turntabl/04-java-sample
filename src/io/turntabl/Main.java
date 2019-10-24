package io.turntabl;

import io.turntabl.Bank.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account(1000000, 1001, AccountType.CURRENT);

        myAccount.deposit(100000);
        System.out.println(myAccount.getBalance());

        Customer sam = new Customer("Sam Moorhouse", Arrays.asList(myAccount));
        System.out.println(sam);
    }
}



