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
        this.transactionDate = cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일";
        this.transactionTime = cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

}
