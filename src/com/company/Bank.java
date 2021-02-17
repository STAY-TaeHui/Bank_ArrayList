package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    public Bank(){
        accounts = new ArrayList<Account>();
    }
    
    // 계좌 생성
    public void addAccount(String accountNo, String name) {
        accounts.add(new Account(accountNo,name));
    }
    // 계좌번호로 계좌 찾기
    public Account getAccount(String accountNo) {  
        Account num = null;
        for(int i = 0; i < accounts.size(); i++) {
            String getnum = accounts.get(i).getAccountNo();
            if(getnum.equals(accountNo)){
                num = accounts.get(i);
            }
        }
        return num;
    }


    // 소유자명으로 계좌 찾기
    public List<Account> findAccounts(String name) {
        List<Account> atmp = new ArrayList<>();
        Account now;
        Iterator<Account> li = accounts.iterator();
        while(li.hasNext()){
            now = li.next();
            if(now.getName().equals(name))
            atmp.add(now);
        }
        System.out.println(atmp);
        return atmp;
    }
    // 계좌목록 확인
    public ArrayList<Account> getAccounts() {
       return null;
    }
    // 총계좌수를 반환
    public int getTotalAccount() {
        return accounts.size();
    }
}
