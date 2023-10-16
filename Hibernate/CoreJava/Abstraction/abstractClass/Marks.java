package abstractClass;

public abstract class Marks {
int p,c,m,s;
Marks(int p,int c,int m,int s){
	this.p=p;
	this.c=c;
	this.m=m;
	this.s=s;
}
public Marks(int p, int c, int m) {
	this.p=p;
	this.c=c;
	this.m=m;
}
public abstract void getPercentage();
}
