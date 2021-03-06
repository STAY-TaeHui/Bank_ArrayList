package com.company;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class Account {
    private String accountNo;
    private String name;
    private long balance;
    private List<Transaction> transactions;


    public Account(String accountNo, String name){
        transactions = new ArrayList<>();
        this.accountNo = accountNo;
        this.name = name;
    }
    //입금
    public void deposit(long amount){
        balance +=amount;
        transactions.add(new Transaction("입금",amount,balance));
        System.out.printf("%d원을 입금 하였습니다.\n",amount);
        System.out.printf("현재 잔액 : %d\n", balance);
    }
    //출금
    public void withdraw(long amount) {
        balance -=amount;
        transactions.add(new Transaction("출금",amount,balance));
        System.out.printf("%d원을 출금 하였습니다.\n",amount);
        System.out.printf("현재 잔액 : %d\n", balance);
    }
    //잔고확인
    public long getBalance() {
        System.out.println("== 현재 잔액 조회 ==");       
        System.out.print("현재 잔액 : ");
        return this.balance;
    }

    //거래내역 확인
    public List<Transaction> getTransactions() {
        //System.out.println(transactions.size());
        return transactions;
    }

    @Override
    public String toString() {
        return "[계좌번호 :" + accountNo + ", 소유자 명 : " + name + ", 잔액 : " + balance + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }



}
