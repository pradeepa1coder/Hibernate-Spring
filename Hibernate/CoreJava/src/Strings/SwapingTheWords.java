package Strings;

public class SwapingTheWords {
	public static void main(String[] args) {
		String one="pradeep";//7
		String two="libraryy";//8
		System.out.println("before swapping\n"+"one :"+one+" two : "+two);
		one=one+two;//pradeeplibrary//15
		two=one.substring(0, one.length()-two.length());//0..14-7
		one=one.substring(two.length(),one.length());
		System.out.println("after swapping\n"+"one :"+one+" two : "+two);


	}
}
