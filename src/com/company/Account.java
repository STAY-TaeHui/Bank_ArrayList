package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Account {
    private String accountNo;
    private String name;
    private long balance;
    private List<Transaction> transaction;
    public Account(String accountNo, String name){
        this.accountNo = accountNo;
        this.name = name;
    }
    
    public void deposit(long amount){
        
    }
    
    public void withdraw(long amount) {

    }
    public long getBalnce() {
        return 0;
    }
    public ArrayList<Transaction> getTransactions() {
        return null;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", transaction=" + transaction +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public String getAccountNo() {
        return accountNo;
    }



}
