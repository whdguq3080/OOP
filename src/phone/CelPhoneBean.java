package phone;

public class CelPhoneBean extends PhoneBean{
	
	private String move; //이동가능함	
	
	public void setMove(String move) {
		this.move = move;
	}
	
	public String getMove() {
		return move;
	}	
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("종류 :%s\n"
				+ "제조사: %s\n"
				+ "이동가능: %s\n"
				+ "통화내용: %s", super.getKind(),
				super.getCompany(),
				move,
				super.getCall());
	}
}
