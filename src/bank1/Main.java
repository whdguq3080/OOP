package bank1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account=null;
		Member member=null;
		while(true) {
		switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌생성\n"
					+ "3.계좌보기")){
			case"0":
				JOptionPane.showMessageDialog(null,"종료..");
				return;
			case"1":
				String id = JOptionPane.showInputDialog("ID 등록");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");
				String pass =JOptionPane.showInputDialog("비밀번호");
				member = new Member(id, name, ssn, pass);
				String info = member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case"2":
				account = new Account(0);
				break;
			case"3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null,open);
				break;
			}
		}
	}
}
