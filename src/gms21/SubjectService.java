package gms21;

public class SubjectService {
	String subjName, profName;
	int score;
	
	
	
	
	
	
	
	
	public String info(String hakbun,String name,String subjName,int score) {
		return String.format("학번%s\n"
				+ "이 름%s\n"
				+ "과 목%s\n"
				+ "점 수%s\n",hakbun,name,subjName,score);
	}
}
