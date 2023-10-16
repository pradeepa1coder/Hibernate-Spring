package NumberSystem;

public class FibinocciUptoGivenNo {
public static void main(String[] args) {
	int n=71;
	int n1=0,n2=1,n3=0;
	for(int i=1;;i++)
	{
		System.out.println(n1);
		n3=n1+n2;
		n1=n2;
		n2=n3;
		if(n1>=n)
			return;
	}
	
}
}
