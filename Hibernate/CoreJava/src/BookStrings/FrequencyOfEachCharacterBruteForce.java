package BookStrings;

public class FrequencyOfEachCharacterBruteForce
{
	public static void main(String[] args)
	{
		String str = "AMMAJI";
		char ch[] = str.toCharArray();
		boolean rs[] = new boolean[ch.length];

			for(int i=0;i<ch.length;i++) 
			{
				int count=1;
				if(rs[i]==false)
				{	
					
					for(int j=i+1;j<ch.length;j++)
					{
						if(ch[i]==ch[j])
						{
							count++;
							rs[j]=true;
						}
					}
					System.out.println(ch[i]+"-->"+count);
				}
			}
	}
}
