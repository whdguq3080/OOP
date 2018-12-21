package bank32;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class AccountBean {
	public final static String BANK_NAME = "국민은행";
	private String accountNum,today;
	private int money;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(int money) {
		this.money= money;
	}
	public int getMoney() {
		return money;
	}
		public String toString(){
	
		return String.format(
				 "날짜 %s\n"
				+"계좌번호%s\n"
				+"잔 액%s\n"
				,today,accountNum,money);
	}
}
