package com.company;

import java.util.Iterator;

public class Task_Bank_ArrayList {
    public static void main(String[] args) {
        Bank bank = new Bank();
        // 계좌 생성
        bank.addAccount("12345", "이동근");
        bank.addAccount("45678", "이동근");
        bank.addAccount("1578946", "서태희");
        bank.addAccount("6656235", "서태희");
        bank.addAccount("1879465", "현상진");
        bank.addAccount("1698856", "현상진");
        bank.addAccount("2262626", "임나영");
        bank.addAccount("783332", "임나영");
        
        // 총 계좌 수
        System.out.println(bank.getTotalAccount());
        
        // 해당 소유자명의 계좌 목록
        bank.findAccounts("이동근");
        // 해당 계좌번호의 계좌 정보
        System.out.println("== 해당 계좌번호의 계좌정보 ==");
        System.out.println(bank.getAccount("1879465"));

        // 입금
        bank.getAccount("12345").deposit(1000);
        bank.getAccount("12345").deposit(2000);
        bank.getAccount("12345").deposit(3000);
        bank.getAccount("45678").deposit(15000);
        // 출금
        bank.getAccount("12345").withdraw(1000);
        bank.getAccount("12345").withdraw(2000);
        // 현재 계좌 잔액 조회
        System.out.println(bank.getAccount("12345").getBalance());
        
        // 해당 소유자명의 계좌 목록
        bank.findAccounts("이동근");

        // 거래내역 확인
        Iterator<Transaction> i =  bank.getAccount("12345").getTransactions().iterator();
        System.out.println("== 거래 내역 ==");
        while(i.hasNext()){
            System.out.println(i.next());
        }



    }
}
