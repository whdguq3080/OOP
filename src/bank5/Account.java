package bank5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class Account {
	final static String BANK_NAME = "국민은행";
	String account,today;
	int money;
	Account(int money){
		this.account = account(0);
		this.today = today();
		this.money = money;
	}

	public String account(int money) {
		String account = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			if (i == 3) {
				account += random.nextInt(10) + "-";
			} else if (i == 0) {
				account += random.nextInt(9) + 1;
			} else {
				account += random.nextInt(10);
			}
			}
			return account;
			}
	public String today() {
		String today="";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today= sdf.format(date);
		return today;
	}	
	//public String 
	
	public String info(){
		
		return String.format("1.은행%s\n"
				+ "2.개설일%s\n"
				+ "3.계좌%s\n"
				+ "4.잔액%s\n",BANK_NAME,today,account,money);
	}	
	}


