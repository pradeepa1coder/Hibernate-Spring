public class RepeatersNotAllow {
	public static void main(String[] args) {
		
//		String str="pradeeppradeep";
//		String temp="";
//		
//		char[] ch=str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			if(temp.contains(String.valueOf(ch[i]))) {
//				continue;
//				
//			}
//			else 
//			{
//				temp=temp+ch[i];
//			}
//		}
//		System.out.println(temp);
		
		
		
		String str="pradeep";
		String s="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			boolean b=true;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					b=false;
					
				}
			}
			if(b==true) {
				 s=s+ch[i];
			}
		}
		System.out.println(s);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "pradeep";
//		char[] ch = str.toCharArray();
//		String str2 = "";
//
//		for (int i = 0; i < ch.length; i++) {
//			if (str2.contains(String.valueOf(ch[i]))) {
//
//			} else {
//				str2 = str2 + ch[i];
//			}
//		}
//		System.out.println(str2);
	}
}