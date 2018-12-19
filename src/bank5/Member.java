package bank5;

public class Member {
	String name,id,pass,ssn;
	Member(String name,String id,String pass,String ssn){
		this.name = name;
		this.id = id;
		this.pass =pass;
		this.ssn =ssn;
	}
	
	public String info() {
		return String.format("1.이름%s\n"
				+ "2.아이디%s\n"
				+ "3.비밀번호%s\n"
				+ "4.주민등록번호%s\n",name,id,pass,ssn);
	}
}
