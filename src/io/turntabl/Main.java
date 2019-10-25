package io.turntabl;

import io.turntabl.Bank.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
        new Account(1000000, 1001, AccountType.CURRENT)
        , new Account(2562456, 102301, AccountType.FIXED_DEPOSIT)
        , new Account(4355, 105601, AccountType.SAVINGS)
        , new Account(12341, 107601, AccountType.CURRENT)
        ,new Account(5135, 1001241, AccountType.CURRENT)
        ,new Account(26562, 103401, AccountType.FIXED_DEPOSIT)
        ,new Account(345345, 108701, AccountType.SAVINGS)
        ,new Account(768756, 108701, AccountType.CURRENT)
        ,new Account(3546, 100341, AccountType.FIXED_DEPOSIT)
        ,new Account(3456, 10124401, AccountType.CURRENT)
        ,new Account(7567, 104101, AccountType.SAVINGS)
        ,new Account(87, 105401, AccountType.FIXED_DEPOSIT)
        ,new Account(45, 101101, AccountType.SAVINGS)
        ,new Account(1234, 10401, AccountType.FIXED_DEPOSIT)
        );

        printAccounts(accounts);

        List<Account> fixedDepositAccounts = new ArrayList<>();
        for(Account acc : accounts){
            if(acc.getType() == AccountType.FIXED_DEPOSIT){
                fixedDepositAccounts.add(acc);
            }
        }

        printAccounts(fixedDepositAccounts);

        List<Integer> balances = new ArrayList<>();
        for (Account fda : fixedDepositAccounts){
            balances.add(fda.getBalance());
        }

        System.out.println(balances);

        int totalFixedDepositBalances = 0;
        for(Integer bal : balances){
            totalFixedDepositBalances += bal;
        }

        System.out.println("Sum of fixed deposit account balances: " +
                totalFixedDepositBalances);
    }

    private static void printAccounts(List<Account> accounts) {
        System.out.println(accounts);
        System.out.println("Length: " + accounts.size());
    }
}



