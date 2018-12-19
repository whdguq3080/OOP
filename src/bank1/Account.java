package bank1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.text.SimpleAttributeSet;
public class Account {
	final static String BANK_NAME = "국민은행";
	String accountNum;
	int money;
	String today;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}	
	public String generatorAccountNum() {
		String accountNum ="";
		Random random = new Random();
		accountNum += random.nextInt(9000)+1000+"-"+random.nextInt(10000); 
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		today =sdf.format(date);
		return today;
	}
		public String open(String name) {
		String open="";
		return String.format("은행이름: %s\n"
				+ "계좌번호: %s\n"
				+ "이름: %s \n"
				+ "날짜:%s \n"
				+ "잔액: &d\n"
				, BANK_NAME,accountNum,name,today,money);
	}
}	
	

