package bank33;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.
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
		public String info(String accountNum,String today,int money,String name) {
			
			return String.format("은행이름 %s\n"
					+ "날짜 %s\n"
					+ "이 름%s\n"
					+ "계좌번호%s\n"
					+ "잔 액%s"
					,AccountBean.BANK_NAME,today,name,accountNum,money);
		}
		/*public String deposit(int money) {
			String deposit ="";
			if(money>0) {
				deposit = "입금됐습니다.";
				this.money+=money;
			}else {
				deposit = "잘못 입력되었습니다.";
			}
			return deposit;
			}*/
			

		public String withdraw(int money) {
			String withdraw = "";
			/*if (money > 0 && this.money >= money) {
				withdraw = "출금됐습니다.";
				this.money -= money;
			} else {
				withdraw = "잘못 입력되었습니다.";
			}*/
			return withdraw;
		}
}
