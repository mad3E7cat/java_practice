class NewThread implements Runnable{
	Thread t;
	NewThread(){
		 t = new Thread(this, "Demo_child_thread");
		 System.out.println("Child thread launched...");
		 t.start(); // this one simply runs the run() method
	}
	public void run(){
		try{
			for(int i = 1; i <= 5; i++){
				System.out.println("Child thread: " + i);
				Thread.sleep(1000); // the one that will be launched will sleep for 1s
			}
		}catch(InterruptedException e){
			System.out.println("Child thread is interrupted...");
		}
		finally{
			System.out.println("Child thread is over...");	
		}
	}
}
class TestClass{
	public static void main(String[] args) {
		System.out.println("Parent thread launched...");
		new NewThread();
		try{
			for(int i = 1; i <= 5; i++){
				System.out.println("Parent thread: " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Parent thread is interrupted...");
		}
		System.out.println("Parent thread is over...");	
	}
}