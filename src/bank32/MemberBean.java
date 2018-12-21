package bank32;

public class MemberBean {
		private String id,pass,name,ssn;
		// 디폴트 생성자는 존재한다.
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getPass() {
			return pass;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}public String getSsn() { 
			return ssn;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getId() {
			return id;
		}
		public void setName(String name) { //getter 게터
			this.name = name; // read 
		}public String getName() {  //getter 게터
			return name; // read 
		}
		public String toString() {
			return String.format("1.아이디%s\n"
					+ "2.비밀번호%s\n"
					+ "3.이름%s\n"
					+ "4.주민번호%s\n",id,pass,name,ssn);
		}
	}
