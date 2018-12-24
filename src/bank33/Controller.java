
package bank33;

import javax.swing.JOptionPane;

import bank31.AccountBean;
import bank31.AccountService;
import bank31.AccountServiceImpl;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService memberService = new MemberServiceImpl();
		AccountBean account = null;
		AccountService service = new AccountServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원목록\n"
					+ "3.계좌확인\n"
					+ "4.계좌정보\n"
					+ "5.입금\n"
					+ "6.출금\n"
					+ "7.비번변경\n"
					+ "8.회원목록\n"
					+ "9.아이디찾기\n"
					+ "10.로그인확인\n"
					+ "11.가입자 수 \n"
					+ "12.아디 비번 변경\n"
					+ "13.회원탈퇴")) {
			case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				memberService.join
						(JOptionPane.showInputDialog("아이디"),
						JOptionPane.showInputDialog("비번"),
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("주민"));
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
			case "8":
				MemberBean[] members= memberService.list(); 
				JOptionPane.showInputDialog(members);
				break;
			case "9":
				JOptionPane.showMessageDialog(null,memberService.find(JOptionPane.showInputDialog("찾을 아이디")));
				break;
			case "10":
				String id = JOptionPane.showInputDialog("로그인 아이디");
				String pass = JOptionPane.showInputDialog("로그인 비번");
				boolean ok = memberService.login(id, pass);
				if(ok) {
					JOptionPane.showMessageDialog(null,"로그인 성공");
				}else {
					JOptionPane.showMessageDialog(null,"로그인 실패");
				}
				break;
					//JOptionPane.showMessageDialog(null, (ok) ? "로그인 성공":"로그인 실패");
			case"11":
				JOptionPane.showMessageDialog(null, "가입자 수 "+ memberService.count());
				break;
			case"12":
				id = JOptionPane.showInputDialog("현재 아이디");
				pass = JOptionPane.showInputDialog("기존 비밀번호");
				String newPass = JOptionPane.showInputDialog("새로운 비밀번호");
				memberService.update(id,pass,newPass);
				break;
			case"13":
				id = JOptionPane.showInputDialog("아이디");
				pass = JOptionPane.showInputDialog("비밀번호");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");
				memberService.delete(id, pass, name, ssn);
			}
		}
	}
}
