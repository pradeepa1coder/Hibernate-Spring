package BookStrings;

public class CountCapitals {
public static void main(String[] args) {
	String str="BanGaLore";
	int count=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z')
			count++;
	}
	System.out.println("Total capitals are : "+count);
}
}
