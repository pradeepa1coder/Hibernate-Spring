package org.durga;

public class DaemonDemo extends Thread {
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("child thread  : "+i);
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
public static void main(String[] args) {
	DaemonDemo t1=new DaemonDemo();
	t1.setDaemon(true);//1
	t1.start();
	for(int i=1;i<=10;i++) {
		System.out.println("main thread   : "+i);
	}
}
}
