package BookNumberSystem;

 class Emplyee {
	int id;
	String fname;
	String lname;
	
	public Emplyee(int id,String ffname,String llname) {
		this.id=id;
		this.fname=ffname;
		this.lname=llname;
	}
	public static void main(String[] args) {
		Emplyee e1=new Emplyee(15,"pradeep","yadav");
		Emplyee e2=new Emplyee(12,"vennela","yadav");
		Emplyee e3=new Emplyee(13,"pavani","yadav");
		
		Emplyee ear[]= {e1,e2,e3};	//object array
		
		for(Emplyee e:ear)
		{
			System.out.println(e.id+" "+e.fname+" "+e.lname);
		}
		
	}
	

}
class Demo{
	public static void main(String[] args) {
		Emplyee e1=new Emplyee(15,"pradeep","yadav");
		Emplyee e2=new Emplyee(12,"vennela","yadav");
		Emplyee e3=new Emplyee(13,"pavani","yadav");
		
		Emplyee ear[]= {e1,e2,e3};	//object array
		
		for(Emplyee e:ear)
		{
			System.out.println(e);
		}
		
	}
}
