package tu;

import javax.swing.JOptionPane;

import bank2.Member;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.시험 결과")) {
			case "0":JOptionPane.showMessageDialog(null,"시스템 종료");
					return;
			case "1":
				     
				break;
			case "2":
				
				break;
			case "3":

				break;
			}
		}
	}
}
