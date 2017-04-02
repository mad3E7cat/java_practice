class ThreeThreads implements Runnable{
	private String name;
	private Thread t; 
	ThreeThreads(String threadName){
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Child thread launched: " + t);
		t.start();
	}
	public void run(){
		try{
			for (int i = 0; i < 5; i++) {
				System.out.println(name + ":" + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("thread " + name + " is interrupted...");
		}
		System.out.println("thread " + name + " is finished.");
	}
}
class TestClass{
	public static void main(String[] args) {
		System.out.println("Parent thread launched...");
		new ThreeThreads("threadOne");
		new ThreeThreads("threadTwo");
		new ThreeThreads("threadThree");
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Parent thread is interrupted...");
		}
		System.out.println("Parent thread is finished.");
	}
}