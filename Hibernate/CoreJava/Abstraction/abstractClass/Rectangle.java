package abstractClass;

public class Rectangle extends Shape {

	int length;
	int width;
	
	public Rectangle(int l,int w,String n) {
		this.name=n;
		this.length=l;
		this.width=w;
	}
	public void display() {
        System.out.println("Parent name: " + this.name);
        System.out.println("Child length: " + this.length);
        System.out.println("Child length: " + this.width);

    }
public static void main(String[] args) {
	Rectangle r1=new Rectangle(10,20,"rectangle1");
	r1.display();
	
}
	
}
