package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.[종료]\n"
					+ "1.회원가입\n"
					+ "2.계좌생성\n"
					+ "3.계좌확인")) {
			case "0":JOptionPane.showMessageDialog(null,"종료...");
				return;
			case "1":
				String id =JOptionPane.showInputDialog(null, "아이디");
				String pass =JOptionPane.showInputDialog(null, "비밀번호");
				String name =JOptionPane.showInputDialog(null, "이 름");
				String ssn =JOptionPane.showInputDialog(null, "주민번호");
				member = new Member(id, pass, name, ssn);
				String open =member.open();
				JOptionPane.showMessageDialog(null,open);
				break;
			case"2" :
				account = new Account(0);
				break;
			case"3" :
				String add = account.ope(member.name);
				JOptionPane.showMessageDialog(null,add);
				break;
			}
		}
	}
}
