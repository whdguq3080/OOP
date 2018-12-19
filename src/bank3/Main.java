package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
		switch (JOptionPane.showInputDialog("0.종료\n"
				+ "1.회원가입\n"
				+ "2.회원정보\n"
				+ "3.계좌개설\n"
				+ "4.계좌정보\n"
				+ "5.입금 \n"
				+ "6.출금")) {
		case "0":
			JOptionPane.showMessageDialog(null, "종료합니다.");
			return;
		case "1":
      		 String id = JOptionPane.showInputDialog("아이디");
			 String name =JOptionPane.showInputDialog("이름");
			 String ssn = JOptionPane.showInputDialog("주민번호");
		     String pass = JOptionPane.showInputDialog("비밀번호");
		     member = new Member(id,name,ssn,pass);
		     JOptionPane.showMessageDialog(null,"완료");
		     break;
		case "2":
			String info = member.info();
			JOptionPane.showMessageDialog(null,info);
			break;
		case "3":
			account = new Account(0);
			break;
		case "4":
			String info1 = account.info();
			JOptionPane.showMessageDialog(null,info1);
			break;
		case "5":
			String inputMoney = JOptionPane.showInputDialog("입금액");
			String message = account.deposit(Integer.parseInt(inputMoney));
			JOptionPane.showMessageDialog(null,message);
			break;
		case "6":
			String outputMoney = JOptionPane.showInputDialog("출금액");
			String message2 = account.withdraw(Integer.parseInt(outputMoney));
			JOptionPane.showMessageDialog(null,message2);
			break;
		}
	}
}

}
