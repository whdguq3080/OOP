package bank31;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService service = new AccountServiceImpl();
		MemberService memberService = new MemberServiceImpl(); 
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n")) {
			case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("아이디");
				String pass = JOptionPane.showInputDialog("비밀번호");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");
				memberService.join(id,name,pass,ssn);
				break;
			case"2":
				account = new AccountBean();
				String info1 = service.accountNum();
				account.setAccountNum(info1);
				String today = service.today();
				account.setToday(today);
				String sMoney = JOptionPane.showInputDialog("입금");
				int imoney = Integer.parseInt(sMoney);
				account.setMoney(imoney);
				String info2= service.info(account.getAccountNum(),account.getToday(),account.getMoney(),member.getName());
				JOptionPane.showMessageDialog(null,info2);
				break;
			case"3":
				account = new AccountBean();
				break;
			case"4":
				String info4 = account.toString();
				JOptionPane.showMessageDialog(null,info4);
				break;
			case"5":
				String in = JOptionPane.showInputDialog("입금");
				//JOptionPane.showMessageDialog(null,account.deposit(Integer.parseInt(info2)));
				break;
			case"6":
				String info3 =  JOptionPane.showInputDialog("출금");
				//JOptionPane.showMessageDialog(null,account.withdraw(Integer.parseInt(info3)));
				break;
			case"7":
				String newpass = JOptionPane.showInputDialog("비번 변경");
				member.setPass(newpass);
				JOptionPane.showMessageDialog(null,member.toString());
			}
		}
	}
}
