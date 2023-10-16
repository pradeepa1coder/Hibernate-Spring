package org.durga;

public class ThreadCommunication extends Thread {
	int total = 0;

	public void run()
	{
		synchronized (this)
		{
		for (int i = 1; i <= 100; i++) {
			total = total + i;
				this.notify();;
			}
		}
		
		
		}

	public static void main(String[] args) throws InterruptedException {
		ThreadCommunication t1 = new ThreadCommunication();
		t1.start();
		synchronized (t1) 
		{
			t1.wait();
		}
		System.out.println("got "+t1.total);
	}
}
