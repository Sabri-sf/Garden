package massage;

public class Service {
	private Student[] list;
	private int top;   //����������ʵ������

	public Service(Student[] list) {
		super();
		this.list = list;
	}

	public void addStudent (Student no) {//��
		
	}

	public void delStudent (Student no) {//ɾ
		for(int i=0;i<list.length;i++)
		{
		Student tmp=list[i];
		if(tmp.getNo().equals(no))
			{
			list[i]=null;
			top=i;
			break;
			}
		}
		for(int i=top;i<list.length;i++)
			list[i]=list[i+1];
		
	}

	public void updateStudent (Student no) {//��
		for(int i=0;i<list.length;i++)
		{
		Student tmp=list[i];
		if(tmp.getNo().equals(no))
			{
			top=i;
			break;
			}
		}
		
		
	
	}

	public Student findStudentByName(String no) {//���Ҹ���
		for(int i=0;i<list.length;i++)
			{
			Student tmp=list[i];
			if(tmp.getNo().equals(no))
				return tmp;
			}
		return null;
	}

	public Student[] findAllStudent(){//�鿴ȫ��
		return this.list;
	}

	public void display() {
		
	}



}
