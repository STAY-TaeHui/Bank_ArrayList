package Home;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Account {
	private String accountNo;//계좌번호
	private String name;
	private long balance;//잔고
	private ArrayList<Transaction> transaction;//거래내역
	private Scanner scanner;
	Date today = new Date();
	
	Account(String accountNo, String name){
		super();
		transaction = new ArrayList<Transaction>();
		this.accountNo = accountNo;
		this.name = name;
		//SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
		//SimpleDateFormat time = new SimpleDateFormat("hh/mm/ss");
	}
	
	public void deposit(long amount) {//입금
		System.out.println(amount+"원 입금하셨습니다.");
		balance += amount;
		System.out.println("현재 잔액은 "+this.balance+"입니다.");
	}
	public void withdraw(long amount) {//출금
		if(balance<amount) {
			System.out.println("잔액부족ㅜㅠ");
		}else {
			System.out.println(amount+"원 인출하셨습니다.");
			balance -= amount;
			System.out.println("현재 잔액은 "+this.balance+"입니다.");
		}
	}
	public long getBalance() {//잔고확인
		System.out.print("계좌번호: ");
		accountNo = scanner.nextLine();
		System.out.println();
		System.out.print("이름: ");
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.println();
		while(!accountNo.equals(accountNo)||!name.equals(name)) {
			System.out.println("일치하지 않습니다. 다시 입력 해주세요.");
			
		}
		System.out.println(this.accountNo+"의 현재 잔액은 "+this.balance+"입니다.");
		return balance;//?
	}
	public ArrayList<Transaction> getTransactions() {//거래내역
		//거래일자,거래시간,입출금,금액,잔액으로 구성
		System.out.println("=거래 내역=");
		return transaction;//?
		
		
	}

	public String getaccountNo() {
		// TODO Auto-generated method stub
		return null;
	}
}
