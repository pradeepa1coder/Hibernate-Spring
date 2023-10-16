package InterviewQuestions;

 class ObjectCreations {
public static void main(String[] args) {
	
}
}
 class Test{
	 public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		 Test t1=new Test();
		 System.out.println(t1);
		 
		 Test t2=(Test)Class.forName("Test").newInstance();
		 System.out.println(t2);

		 
	}
 }
