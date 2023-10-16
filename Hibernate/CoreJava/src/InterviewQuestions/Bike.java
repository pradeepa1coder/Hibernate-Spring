package InterviewQuestions;

// DoubleTon object creation
public class Bike {
	private static Bike b1=null;
	private static Bike b2=null;
	private Bike() {
		
	}
	public static Bike getBike() {
		if(b1==null) 
		{
			b1=new Bike();
			return b1;
		}
		else if(b2==null) 
		{
			b2=new Bike();
			return b2;
		}
		return b1;
		
		
	}
	
public static void main(String[] args) {
	Bike b5=new Bike();
	System.out.println(b5);
	Bike b51=new Bike();
	System.out.println(b51);
	Bike b2=Bike.getBike();
	Bike b3=Bike.getBike();
	Bike b4=Bike.getBike();
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);

	
	
}
}
