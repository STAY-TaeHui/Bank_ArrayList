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

    private SimpleDateFormat ymd;
    private SimpleDateFormat hms;


    public Transaction(String kind, long amount, long balance) {
//        cal = Calendar.getInstance();
//        this.transactionDate = cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일";
//        this.transactionTime = cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
        ymd = new SimpleDateFormat("yyyy/ MM/dd");
        hms = new SimpleDateFormat("a HH:mm:ss");
        date = new Date();

        this.transactionDate=ymd.format(date);
        this.transactionTime = hms.format(date);
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionDate='" + transactionDate + '\'' +
                ", transactionTime='" + transactionTime + '\'' +
                ", kind='" + kind + '\'' +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }
}
