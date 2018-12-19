package bank2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
		final static String BANK_NAME= "국민은행";
		String accountNum , today;
		int money;
		Account(int money){
			this.accountNum = this.generatorAccountNum();
			this.today = this.today();
			this.money = money;
		}
		public String generatorAccountNum() {
			String ga = "";
			Random random = new Random();
			for(int i=0; i<8; i++) {
				if(i==3) {
					ga += random.nextInt(10)+"-";
				}else if(i==0){
					ga += random.nextInt(9)+1;
				}else  {
					ga += random.nextInt(10);
				}
			}
			return ga;
		}
		public String today() {
			String today ="";
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			today = sdf.format(date);
			return today;
		}
		public String ope(String name) {
			return String.format("1.은행이름%s\n"
				+ "2.이름%s\n"
				+ "3.계좌번호%s\n"
				+ "4.날짜%s\n"
				+ "5.잔액%s",BANK_NAME,name,accountNum,today,money);
	}
}
