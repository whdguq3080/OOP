package bank33;
import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members; 
	private int count;
	
	MemberServiceImpl(){
		this.members = new MemberBean[10];
		this.count = 0;
	}
	
	@Override
	public void join(String id,String pass,String name,String ssn){
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setSsn(ssn);
		members[count]= member;
		count++;
	}
	@Override
	public MemberBean[] list() {
		// TODO Auto-generated method stub
		return members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}
	@Override
	public boolean login(String id, String pass) {
		boolean ok = false;
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)&& members[i].getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public void update(String id,String pass,String newPass) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)&& members[i].getPass().equals(pass)) {
				members[i].setPass(newPass); 
				break;
			}
		}
	}
	@Override
	public void delete(String id,String pass,String name,String ssn) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)&& members[i].getPass().equals(pass)&& members[i].getSsn().equals(ssn)) {
				members[i]= null;
				break;
			}
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
