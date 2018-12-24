package bank32;

import javax.swing.JOptionPane;


public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService memberService = new MemberSeviceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원목록")) {
			case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				memberService.join(
				JOptionPane.showInputDialog("ID등록"), 
				JOptionPane.showInputDialog("이름 등록"), 
				JOptionPane.showInputDialog("주민번호 등록"), 
				JOptionPane.showInputDialog("비번 등록"));
				break;
		/*	case "2":
				MemberBean[] members = memberService.find();
				JOptionPane.showMessageDialog(null,members);
				break;*/
/*			case"2":
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
				JOptionPane.showMessageDialog(null,member.toString());*/
			}
		}
	}
}
