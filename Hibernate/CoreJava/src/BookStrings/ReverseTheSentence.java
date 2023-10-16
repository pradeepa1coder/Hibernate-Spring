package BookStrings;

public class ReverseTheSentence 
{
public static void main(String[] args) 
{
	String str="pradeep is a good boy";
	
	String[] st=str.split(" ");
	for(int i=st.length-1;i>=0;i--) {
		System.out.print(st[i]+ " ");//boy good a is pradeep 
	}
	
	
	
}
}
