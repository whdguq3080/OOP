package bank5;

import javax.sound.midi.MidiDevice.Info;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member=null;
		Account account = null;
		while(true) {
		switch (JOptionPane.showInputDialog("0.종료\n"
				+ "1.회원가입\n"
				+ "2.회원정보\n"
				+ "3.계좌생성\n"
				+ "4.계좌확인\n"
				+ "5.입금\n"
				+ "6.출금\n"
				)) {
		case "0":JOptionPane.showMessageDialog(null,"시스템 종료");
			return;
		case "1":
			String name = JOptionPane.showInputDialog("이름");
			String id = JOptionPane.showInputDialog("아이디");
			String pass = JOptionPane.showInputDialog("비밀번호");
			String ssn = JOptionPane.showInputDialog("주민등록번호");
			member = new Member(name, id, pass, ssn);
			String info1 = member.info();
			JOptionPane.showMessageDialog(null,info1); 
			break;
		case "2":
			String info2 =member.info();
			JOptionPane.showMessageDialog(null, info2);
			break;
		case "3":
			account = new Account(0);
			break;
		case "4":
			String info3 = account.info();
			JOptionPane.showMessageDialog(null, info3);
		case "5":
			
		}
	}
}
}
