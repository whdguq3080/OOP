package bank11;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌확인\n"
					+ "4.계좌정보\n"
					+ "5.입금\n"
					+ "6.출금\n"
					+ "7.비번변경")) {
			case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("아이디");
				String pass = JOptionPane.showInputDialog("비밀번호");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");
				member = new Member(id, pass, name, ssn);
				String info = member.toString(); 
				JOptionPane.showMessageDialog(null, info);
				break;
			case"2":
				String info1 = member.toString();
				JOptionPane.showMessageDialog(null, info1);
				break;
			case"3":
				account = new Account(0);
				break;
			case"4":
				String info4 = account.toString();
				JOptionPane.showMessageDialog(null,info4);
				break;
			case"5":
				String info2 = JOptionPane.showInputDialog("입금");
				JOptionPane.showMessageDialog(null,account.deposit(Integer.parseInt(info2)));
				break;
			case"6":
				String info3 =  JOptionPane.showInputDialog("출금");
				JOptionPane.showMessageDialog(null,account.withdraw(Integer.parseInt(info3)));
				break;
			case"7":
				String newpass = JOptionPane.showInputDialog("비번 변경");
				member.setPass(newpass);
				JOptionPane.showMessageDialog(null,member.toString());
			}
		}
	}
}
