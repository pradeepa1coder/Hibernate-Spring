
public class MultiThread extends Thread 
{
	public void run() {
		System.out.println("Hii from run method by jvm");
	}
	
public static void main(String[] args) {
	MultiThread m1=new MultiThread();
	Thread t1=new Thread(m1);
	t1.start();
	System.out.println("Hii from main method by jvm");
}
}
