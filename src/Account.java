public class Account {
    private String accountNo;
    private String name;
    private long balance;
    private Transaction[] transaction;
    public Account(String accountNo, String name){
        this.accountNo = accountNo;
        this.name = name;
    }
    
    public void deposit(long amount){
        
    }
    
    public void withdraw(long amount) {

    }
    public long getBalnce() {
        return 0;
    }
    public Transaction[] getTransactions() {
        return null;
    }
    
    
    public String getAccountNo() {
        return accountNo;
    }

    @Override
    public String toString() {
        return "[계좌번호 :" + accountNo + ", 소유자 명 : " + name + ", 잔액 : " + balance + "]";
    }

}
