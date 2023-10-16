
class Dummy {
	public static void main(String[] args) {
		String str = "Jspiders";
		char[] ch = str.toCharArray();
		char c = ch[0];int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == c) 
			{
				count++;
				System.out.print(count);
			} else {
				System.out.print(ch[i]);
			}
 
		}
	}
}
