package Strings;

public class RemoveSpaces {
	public static void main(String[] args) {
		String str = "Golla pradeep 325 ";
		System.out.println(str);//Golla pradeep 325

		str = str.replaceAll(" ", "");
		System.out.println(str);//Gollapradeep325
	}
}
