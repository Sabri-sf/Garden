package massage;

public class Test {
	public static void main(String[] args) {
		Student[] list=new Student[100];
		Score[] sc=new Score[100];
		for(int j=0;j<sc.length;j++)
			sc[j]=new Score(""+j,"java",j);
		for(int i=0;i<list.length;i++)
			list[i]=new Student("ÕÅ"+i,""+i,"ÄÐ","¼ÆËã»ú",1,sc[i]);
		
	}

}
