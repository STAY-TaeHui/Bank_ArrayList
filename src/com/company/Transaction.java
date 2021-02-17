package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Transaction {
    private String transactionDate;
    private String transactionTime;
    private String kind;
    private long amount;
    private long balance;

    private Calendar cal;
    private Date date;


    public Transaction(String kind, long amount, long balance) {
        cal = Calendar.getInstance();

        this.transactionDate= (new SimpleDateFormat("yy년MM월dd일 HH시mm분ss초")).format(cal.getTime());

        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return  "[거래금액 : " + amount + "원, 잔액 : " + balance + "원 /" + transactionDate + "]";
    }
}
