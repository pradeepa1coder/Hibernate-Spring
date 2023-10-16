package NumberSystem;

import java.util.Scanner;

public class EuclideanDistance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int sq1=n1*n1;
	int sq2=n2*n2;
	int tot=sq1+sq2;
	for(int i=0;i<tot;i++) {
		if(i*i==tot)
			System.out.println("the distance is : "+i);
	}
}
}
