package gms21;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		StudentBean studentBean = null;
		StudentService studentService = new StudentService();
		SubjectBean subject = new SubjectBean();
		SubjectService subjectService = new SubjectService();
		while(true) {
			//성적표에 표시될 내용 :
			//학번(subject)
			//학생이름(subject)
			//과목명(subject)
			//점수*(subject)
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.학생부 등록\n"
					+ "2.비번변경\n"
					+ "3.회원정보보기\n" 
					+ "4.수강과목등록\n"
					+ "5.점수 입력\n"
					+ "6.성적표 보기")){
			case "0":JOptionPane.showMessageDialog(null,"시스템 종료");
					return;
			case "1":String hakbun = JOptionPane.showInputDialog("아이디");
					 String name = JOptionPane.showInputDialog("이름");
					 String ssn = JOptionPane.showInputDialog("주민번호");
					 String pass = JOptionPane.showInputDialog("비밀번호");
					 studentBean = new StudentBean();
					 studentBean.setHakbun(studentService.hakbun1());
					 studentBean.setName(name);
					 studentBean.setSsn(ssn);
					 studentBean.setPass(pass);
					 JOptionPane.showMessageDialog(null,"등록 완료");
					 break;
			case "2":String change = JOptionPane.showInputDialog("비번 변경");
					 studentBean.setPass(change);
					 JOptionPane.showMessageDialog(null,"변경 완료");
			 	     break;
			case "3":JOptionPane.showMessageDialog(null,studentService.info(studentBean.getHakbun(),
															studentBean.getName(),studentBean.getSsn(),studentBean.getPass()));
					 break;
			case "4":String sub = JOptionPane.showInputDialog("수강 과목 등록");
					 subject.setsubjName(sub);
			case "5":String num = JOptionPane.showInputDialog("점수 입력");
			 		 subject.setscore(Integer.parseInt(num));
					 
			case "6":JOptionPane.showMessageDialog(null,subjectService.info(studentBean.getHakbun(), 
													studentBean.getName(), 
													subject.getsubjName(), 
													subject.getscore()));
			
			}
		}
	}
}
