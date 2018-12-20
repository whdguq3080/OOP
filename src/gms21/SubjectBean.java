package gms21;

public class SubjectBean {
	private String subjName, profName;
	private int score;
	
	public void setsubjName(String subjName) {
		this.subjName = subjName;
	}

	public String getsubjName() {
		return subjName;
	}

	public void setprofName(String profName) {
		this.profName = profName;
	}

	public String getprofName() {
		return profName;
	}
	public void setscore(int score) {
		this.score = score;
	}

	public int getscore() {
		return score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}