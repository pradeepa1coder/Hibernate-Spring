package org.durga;

public class DeadLock1 extends Thread {
	A a = new A();
	B b = new B();

	public void run() {
		b.d2(a);
	}

	public void temp() {
		
		a.d1(b);
	}

	public static void main(String[] args) {
		DeadLock1 t1 = new DeadLock1();
		t1.start();
		t1.temp();

	}
}

class A {
	public synchronized void d1(B b) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.last();
	}

	synchronized void last() {
		System.out.println("last() from A class");
	}

}

class B {
	public synchronized void d2(A a) 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.last();
	}

	synchronized void last() {
		System.out.println("last() from B class");

	}

}
