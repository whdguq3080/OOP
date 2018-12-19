package bank3;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 계좌 클래스
 *	[속성]
 *상수 : BANK_NAME
 *멤버변수 :
 *	accountNum 계좌번호
 *	money 잔액
 *	today 해당일
 *	[기능]
 *	1.generatorAccountNum() 계좌번호 생성(랜덤)
 *	2.today() 개설일
 *	3.deposit() 입금하기	
 *	4.withdraw() 출금하기
 *	5.info() 개인정보
 * */
import java.util.Random;
public class Account {
	final static String BANK_NAME = "국민은행"; 
	String account, today;
	int money;
	Account(int money) {
		this.account = accountNum();
		this.today = today();
		this.money = money;
	}
	public String accountNum() {
		String account = "";
		Random random = new Random();
		for(int i=0; i<8; i++) {
			if(i==3) {
				account += random.nextInt(10)+"-";
			}else if(i==0){
				account += random.nextInt(9)+1;
			}else {
				account += random.nextInt(10);
			}
		}
		return account;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		return sdf.format(date);
		}
			public String deposit(int money) {
				String message = "";
				if(money> 0) {
					this.money += money;
					message = "입금완료";
				}else {
					message = "잘못 되었습니다.";
				}
				return message;
			}
			public String withdraw(int money) {
				String message = "";
				if(money>0 && this.money>=money) {
					this.money -= money;
					message = "출금완료";
				}else {
					message = "잘못 되었습니다.";
				}
				return message;
			}
			public String info() {
		
				return String.format("0.은행이름%s\n"
						+ "1.계좌번호%s\n"
						+ "2.개설일%s\n"
						+ "3.잔액%s",BANK_NAME,account,today,money);
			}
		}
