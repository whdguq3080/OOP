package bank32;

public interface MemberService {
	//회원가입
	public void join(String id, 
							String name, 
							String pass, 
							String ssn);
	//목록보기
	public MemberBean[] list();
	// 로그인
	public void login() ;
	// 정보수 정
	public void update() ;
	//회원탈퇴
	public void delete() ;
}
