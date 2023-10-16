package Strings;

public class ReverseArray {
public static void main(String[] args) {
	String[] str= {"Mohan","Dilip","Manu"};
	System.out.print('"');
	System.out.print("Hi!,my friends are: ");
	for(int i=str.length-1;i>=0;i--) {
		System.out.print(str[i]+" ");
	}
	System.out.print('"');
}
}
