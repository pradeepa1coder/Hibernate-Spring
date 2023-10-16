class MultiRunnable implements Runnable {
	String name;

	public MultiRunnable(String nm) {
		this.name = nm;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " : " + i);
		}
	}

	public static void main(String[] args) {
		MultiRunnable m1 = new MultiRunnable("Thread 1");
		Thread t1 = new Thread(m1);
		MultiRunnable m2 = new MultiRunnable("Thread 2");
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try 
		{
			t2.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("main : " + i);
		}

	}

}
