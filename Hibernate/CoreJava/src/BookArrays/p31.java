package BookArrays;

public class p31 {
public static void main(String[] args) {
	int ar[] = { 10, 2, 10, 30, 40, 2, 50 };
	int ele=20;
	int ind=isSearch(ar,ele);
	if(ind!=-1)
		System.out.println(ele+" is present at "+ind+" index");
	else
		System.out.println(ele+" is not present in given array");
}
public static int isSearch(int ar[],int ele) {
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]==ele)
			return i;
		
	}
	return -1;
}
}
