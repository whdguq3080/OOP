package bank32;
import javax.swing.JOptionPane;

public class MemberSeviceImpl implements MemberService{
	private MemberBean[] members;
	private int count;
	
	MemberSeviceImpl(){
		members = new MemberBean[10];
		count=0;
	}
	
	
	@Override
	public void join(String id, String name, String pass, String ssn) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member;
		count++;
	}
	@Override
	public MemberBean[] list() {
		// TODO Auto-generated method stub
		return members;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
