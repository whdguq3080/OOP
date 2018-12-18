package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
		switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입 "
					+ "2.계좌개설"
					+ "3.계좌보기")) {
			case"0":
				JOptionPane.showMessageDialog(null, "종료..");
				return;
			case"1":
				String id = JOptionPane.showInputDialog("ID 등록");
				String name =	JOptionPane.showInputDialog("이름 등록");
				String ssn = JOptionPane.showInputDialog("주민등록번호 등록");
				String pass = JOptionPane.showInputDialog("비밀번호 등록");
				member = new Member(id, name, ssn, pass);
				String info =member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case"2":
				account= new Account(0);
				//파라미터와 아규먼트는 타입과 개수가 일치해야한다.
				break;
			case"3":
				String add = account.add(member.name);
				JOptionPane.showMessageDialog(null,add);
				break;
		}
	}
	}
}

