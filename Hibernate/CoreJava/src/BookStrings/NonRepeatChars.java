package BookStrings;

public class  NonRepeatChars
{
	// Non repeat characters from a given string
	public static void main(String[] args) 
	{
		String str = "pradeep";//rad
		getCount(str);
	
	}
	public static void getCount(String str) 
	{
		char[] ch=str.toCharArray();
		int[] count=new int[128];
		for(int i=0;i<ch.length;i++) {
			count[(int)ch[i]]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==1) 
			{
				System.out.println((char)i);
			}
		}
	}
	}
