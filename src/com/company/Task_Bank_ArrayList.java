package com.company;

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


    }
}
