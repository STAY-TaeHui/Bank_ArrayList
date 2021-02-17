package com.company;

import java.util.Iterator;

public class Task_Bank_ArrayList {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount("12345", "이동근");
        bank.addAccount("45678", "김동동");
        bank.addAccount("121212", "이동근");
        //System.out.println(bank.getAccount("12345"));
//        System.out.println(bank.getAccount("45678"));
//        System.out.println(bank.getAccount("12345"));
//        System.out.println(bank.getAccounts());
        bank.findAccounts("이동근");
        System.out.println(bank.getAccount("12345").getBalance());

        bank.getAccount("12345").deposit(2000);
        System.out.println(bank.getAccount("12345").getBalance());
        bank.getAccount("12345").withdraw(1000);
        System.out.println(bank.getAccount("12345").getBalance());



//        Iterator<Transaction> i =  bank.getAccount("12345").getTransactions().iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }



    }
}
