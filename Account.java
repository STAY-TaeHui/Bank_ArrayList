package kr.or.hw;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class Account {
    String accountNo; // 계좌번호
    String name; // 소유자명
    long balance; // 잔고
    private Account[] accounts; // 거래내역

    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy / mm / dd");
    SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH : mm : ss");

    // 생성자
    Account() {

    }

    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
    }

    public Account(String accountNo, String name, long balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    // 입금
    public void deposit(long amount) {
        System.out.println(amount + "원 입금하셨습니다.");
        balance = balance + amount;
        System.out.println("현재 잔액은" + this.balance + "원 입니다.");
        Transaction transaction = new Transaction();
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();

        transaction.transactionDate(DATE_FORMAT.format(d));
        transaction.transactionTime(TIME_FORMAT.format(c));

    }

    // 출금
    public void withdraw(long amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다");
        } else {
            balance = balance - amount;
            System.out.println("현재 잔액은" + this.balance + "원 입니다.");
        }

        Transaction transaction = new Transaction();
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();

        transaction.transactionDate(DATE_FORMAT.format(d));
        transaction.transactionTime(TIME_FORMAT.format(c));

    }

    // 잔고 확인
    public long getBalance() {
        while(!accountNo.equals(accountNo) || !name.equals(name)) {
            System.out.println("잔고 확인이 불가합니다 ");
        }
        System.out.println("현재 잔액은" + this.balance+"입니다.");
        return 0;
    }

    // 거래내역 보기
    public Transaction[] getTransactions() {
        
        return null;
    }

    public String getAccountNo() {
        // TODO Auto-generated method stub
        return null;
    }

  

    
}
