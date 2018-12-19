package bank4;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class Account {
	final static String BANK_NAME = "국민은행";
	String accountNum,today;
	int money;
	
	Account(int money){
	this.accountNum = accountNum();
	this.today=today();
	this.money=money;
	}
	public String accountNum() {
	String accountNum = "";
	Random random = new Random();
		for (int i = 0; i < 8; i++) {
			if (i == 3) {
				accountNum += random.nextInt(10) + "-";
			} else if (i == 0) {
				accountNum += random.nextInt(9) + 1;
			} else {
				accountNum += random.nextInt(10);
			}
		}
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String deposit(int money) {
		String deposit ="";
		if(money>0) {
			deposit = "입금됐습니다.";
			this.money+=money;
		}else {
			deposit = "잘못 입력되었습니다.";
		}
		return deposit;
		}

	public String withdraw(int money) {
		String withdraw = "";
		if (money > 0 && this.money >= money) {
			withdraw = "출금됐습니다.";
			this.money -= money;
		} else {
			withdraw = "잘못 입력되었습니다.";
		}
		return withdraw;
	}
		
		public String info(){
	
		return String.format("1.은행이름%s\n"
				+ "2.개설일 %s\n"
				+ "3.계좌번호%s\n"
				+ "4.잔액%s\n"
				,BANK_NAME,today,accountNum,money);
	}
}
