class NewThread extends Thread{
	NewThread(){
		super("demoThread");
		System.out.println("Child thread launched: " + this);
		start();
	}
	public void run(){
		try{
			for (int i = 0; i < 5; i++ ) {
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child thread interrupted...");
		}
		System.out.println("Child thread finished.");
	}
}
class TestClass{
	public static void main(String[] args) {
		System.out.println("Parent thread launched...");
		new NewThread();
		try{
			for (int i = 0; i < 5; i++) {
				System.out.println("Parent thread: " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Parent thread interrupted...");
		}
		System.out.println("Parent thread is finished.");
	}
}