package Strings;

public class RemoveSpecialCharacters {
public static void main(String[] args) {
	String str="#Pradeepyadav5@yahoo.!";
	str=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(str);//Pradeepyadavyahoo
}
}
//str=str.replaceAll("[^A-Za-z0-9]","");