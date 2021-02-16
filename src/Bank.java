import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    private ArrayList<Account> accounts;
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
    public Account[] findAccounts(String name) {
        return null;
    }
    // 계좌목록 확인
    public Account getAccounts() {
        Account[] num = null;
        Iterator<Account> Ilist = accounts.iterator();
        while(Ilist.hasNext()) {
            num = Ilist.next();
        }
        return num;
    }
    // 총계좌수를 반환
    public int getTotalAccount() {
        return accounts.size();
    }
}