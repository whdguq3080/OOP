package bank11;

public class Member {
		private String id,pass,name,ssn;
		public Member(String id,String pass,String name,String ssn){
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.ssn = ssn;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getPass() {
			return pass;
		}
		public String getSsn() {
			return ssn;
		}
		public String getId() {
			return id;
		}
		public String getName() { //getter 게터
			return name; // read 
		}
		public String toString() {
			return String.format("1.아이디%s\n"
					+ "2.비밀번호%s\n"
					+ "3.이름%s\n"
					+ "4.주민번호%s\n",id,pass,name,ssn);
		}
	}
