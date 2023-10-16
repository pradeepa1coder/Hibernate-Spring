package Strings;

public class IdentifyNotRepeatedChar {
	public static void main(String[] args) {
		String str = "ABCDEFDEF";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int icount=1;
			for (int j = i + 1; j < ch.length; j++) 
			{
				if (ch[i] == ch[j]) 
				{
					++icount;
					System.out.println(ch[i]+" ,"+icount);
				}

			}
			if(icount==1) {
				System.out.println(ch[i]);
			}

		}
	}
}
+