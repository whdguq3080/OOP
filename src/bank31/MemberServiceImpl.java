package bank31;

import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService{
	MemberBean member = new MemberBean();
	
	@Override
	public MemberBean join(String id, String name, String pass, String ssn) {
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setSsn(ssn);
		return member;
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
