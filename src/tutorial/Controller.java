package tutorial;

import javax.swing.JOptionPane;


public class Controller {
	MemberBean memberBean = null;
	MemberService service = new MemberServiceImpl();
	public static void main(String[] args) {
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원목록\n"
					+ "3.아이디찾기\n"
					+ "4.로그인확인\n"
					+ "5.가입자 수 \n"
					+ "6.아디 비번 변경\n"
					+ "7.회원탈퇴")) {
			case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				break;	
			case "2":break;	
			case "3":break;	
			case "4":break;	
			case "5":break;	
			case "6":break;	
			case "7":break;	
				
			
			}
		}
	}
}