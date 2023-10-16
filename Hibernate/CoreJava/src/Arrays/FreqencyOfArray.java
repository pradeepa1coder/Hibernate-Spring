package Arrays;

public class FreqencyOfArray {
	public static void main(String[] args) {
		String str = "AAraadhya";
		char ch[] = str.toCharArray();
		boolean rs[] = new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) // AARAADHYA
		{

			if (rs[i] == false) 
			{
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) 
				{

					if (ch[i] == ch[j]) 
					{
						count++;
						rs[j] = true;
					}
				}
				System.out.println(ch[i] + "-------->" + count);
			}
		}
	}
}
