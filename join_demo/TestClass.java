class DemoJoin implements Runnable{
	Thread t;
	String name;
	DemoJoin(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}
	public void run(){
		try{
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ":" + i);
				Thread.sleep(1000); // sleep for a second
				}
		}catch(InterruptedException e){
			System.out.println("Thread " + name + " interrupted...");
		}
		System.out.println("Thread " + name + " finished.");
	}
}

class TestClass{
	public static void main(String[] args) {
		DemoJoin th1 = new DemoJoin("first");
		DemoJoin th2 = new DemoJoin("second");
		DemoJoin th3 = new DemoJoin("third");
		System.out.println(th1 + " runs: " + th1.t.isAlive());
		System.out.println(th2 + " runs: " + th2.t.isAlive());
		System.out.println(th3 + " runs: " + th3.t.isAlive());
		try{
			System.out.println("Waiting for threads to finish...");
			th1.t.join();
			th2.t.join();
			th3.t.join();
		}catch(InterruptedException e){
			System.out.println("Child threads are finished.");
		}
		System.out.println(th1 + " runs: " + th1.t.isAlive());
		System.out.println(th2 + " runs: " + th2.t.isAlive());
		System.out.println(th3 + " runs: " + th3.t.isAlive());
		System.out.println("main thread " + Thread.currentThread() + "is finished.");
	}
}