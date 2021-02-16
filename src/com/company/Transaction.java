package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private String transactionDate;
    private String transactionTime;
    private String kind;
    private long amount;
    private long balance;
//    private SimpleDateFormat ymd;
//    private SimpleDateFormat hms;
//    private Date date;

    public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
//        ymd = new SimpleDateFormat("yyyy / MM / dd");
//        hms = new SimpleDateFormat("HH:mm:ss a");
//        date = new Date();
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

}
