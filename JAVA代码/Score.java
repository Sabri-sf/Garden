package massage;

public class Score {
	private String no;         //学号
	private String subject;   //学科
	private double score;      //成绩
	
	

	public Score(String no, String subject, double score) {
		super();
		this.no = no;
		this.subject = subject;
		this.score = score;
	}

	public Score() {
		super();
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [no=" + no + ", subject=" + subject + ", score=" + score + "]";
	}

	
	
	

}
