package massage;

public class Student {
	private String name;    //����
	private String no;   //ѧ��
	private String sex;   //�Ա�
	private String major;   //רҵ
	private int cla;    //�༶
	private Score score;    //�ɼ�
	
	

	public Student(String name, String no, String sex, String major, int cla, Score score) {
		super();
		this.name = name;
		this.no = no;
		this.sex = sex;
		this.major = major;
		this.cla = cla;
		this.score = score;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCla() {
		return cla;
	}

	public void setCla(int cla) {
		this.cla = cla;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", sex=" + sex + ", major=" + major + ", cla=" + cla
				+ ", score=" + score + "]";
	}
	
	

}
