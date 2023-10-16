package Strings;

public class AddTheNum {
	public static void main(String[] args) {
		String str = "pradeep22yadav33";
		char[] ch = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			String temp = "";
			int num = 0;

			while (i < ch.length && ch[i] >= '0' && ch[i] <= '9') {
				temp = temp + ch[i];
				i++;
			}
			if (temp != "") // 22
			{
//				num = Integer.parseInt(temp);
//				sum = sum + num;
//				temp = "";

				for (int j = 0; j < temp.length(); j++) 
				{
					char d = temp.charAt(j);
					num = num * 10 + (d - 48);
				}
				sum = sum + num;
				num = 0;

			}
		}
		System.out.println(sum);
	}
}
