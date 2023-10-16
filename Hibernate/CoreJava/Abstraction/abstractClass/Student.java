package abstractClass;

public class Student extends Marks {

	Student(int p, int c, int m, int s)
	{
		super(p, c, m, s);
	}

	

	public Student(int p, int c, int m) {
		super(p, c, m );
	}



	@Override
	public void getPercentage() {
		System.out.println(p+c+m+s);
	}
	public static void main(String[] args) {
		Student s1=new Student(50, 50, 50, 50);
		s1.getPercentage();
		Student s2=new Student( 50, 50, 50);
		s2.getPercentage();
	}

}
