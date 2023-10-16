package BookStrings;

public class CountSmalls {
	public static void main(String[] args) {
		String str="DhArWaDa";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				count++;
		}
		System.out.println("Total smalls are : "+count);
	}
}
