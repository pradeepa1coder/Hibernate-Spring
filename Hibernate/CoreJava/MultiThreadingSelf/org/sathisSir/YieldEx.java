package org.sathisSir;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " By " + Thread.currentThread().getName());
		}
	}
}

public class YieldEx {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " By " + Thread.currentThread().getName());
			Thread.yield();
		}

	}
}
