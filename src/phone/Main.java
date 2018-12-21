package phone;
import javax.swing.JOptionPane;

		public class Main {
		public static void main(String[] args) {
			PhoneBean phone = null;
			CelPhoneBean cel = null;
			IPhoneBean iPhone = null;
			AndroidPhoneBean aPhone = null;
			while(true) {
				switch (JOptionPane.showInputDialog("0.종료\n"
						+ "1.일반폰\n"
						+ "2.휴대폰\n"
						+ "3.아이폰\n"
						+ "4.안드로이드폰\n"
						+ "5.\n"
						+ "6.\n"
						+ "7.")) {
				case "0":JOptionPane.showMessageDialog(null, "시스템 종료");
						 return;
				case "1":
						phone = new PhoneBean();
						String kind= JOptionPane.showInputDialog("종류");
						String company= JOptionPane.showInputDialog("어느회사제품");//금성
						String call = JOptionPane.showInputDialog("통화내용");//안녕 
						phone.setKind(kind);
						phone.setCompany(company);
						phone.setCall(call);
						JOptionPane.showMessageDialog(null,phone.toString());
						//종류 : 일반 전화기
						//제조사 : 금성
						//통화내용 : 안녕
						break;
				case "2":cel = new CelPhoneBean();
						 kind= JOptionPane.showInputDialog("종류");
						 company= JOptionPane.showInputDialog("어느회사제품");//금성
						 String move= JOptionPane.showInputDialog("이동가능");//금성
						 call= JOptionPane.showInputDialog("통화내용");//안녕 
						 JOptionPane.showMessageDialog(null,phone.toString());
						 cel.setKind(kind);
						 cel.setCompany(company);
						 cel.setMove(move);
						 cel.setCall(call);
						 JOptionPane.showMessageDialog(null,cel.toString());
						 break;
				case "3":iPhone = new AndroidPhoneBean();
						 kind= JOptionPane.showInputDialog("종류");
						 company= JOptionPane.showInputDialog("어느회사제품");//금성
						 move= JOptionPane.showInputDialog("이동가능");//금성
						 String data= JOptionPane.showInputDialog("검색");//금성
						 iPhone.setKind(kind);
						 iPhone.setCompany(company);
						 iPhone.setMove(move);
						 iPhone.setData(data);
						 JOptionPane.showMessageDialog(null,aPhone.toString());
						 // 종류 : 아이폰
						 // 제조사 : 애플
						 // 이동성 : 이동가능함
						 // 검색 : 노래검색
						 break;
				case "4":aPhone = new AndroidPhoneBean();
						 kind= JOptionPane.showInputDialog("종류");
						 company= JOptionPane.showInputDialog("어느회사제품");//금성
						 move= JOptionPane.showInputDialog("이동가능");//금성
						 String display= JOptionPane.showInputDialog("몇인치?");//금성
						 data= JOptionPane.showInputDialog("검색");//금성
						 aPhone.setKind(kind);
						 aPhone.setCompany(company);
						 aPhone.setMove(move);
						 aPhone.setDisplay(display);
						 aPhone.setData(data);
						 JOptionPane.showMessageDialog(null,aPhone.toString());
						 //종류 : 갤노트
						 //제조사 : 삼성
						 //이동가능 : 이동가능함
						 //큰화면 : 6인치
						 //검색 : 영화검색
						 break;
				}
		}
	}
}