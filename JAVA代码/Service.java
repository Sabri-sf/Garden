package massage;

public class Service {
	private Student[] list;
	private int top;   //计数器，无实际意义

	public Service(Student[] list) {
		super();
		this.list = list;
	}

	public void addStudent (Student no) {//增
		
	}

	public void delStudent (Student no) {//删
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

	public void updateStudent (Student no) {//改
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

	public Student findStudentByName(String no) {//查找个人
		for(int i=0;i<list.length;i++)
			{
			Student tmp=list[i];
			if(tmp.getNo().equals(no))
				return tmp;
			}
		return null;
	}

	public Student[] findAllStudent(){//查看全部
		return this.list;
	}

	public void display() {
		
	}



}
