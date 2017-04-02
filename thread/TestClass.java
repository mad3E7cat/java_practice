class TestClass{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		t.setName("renamedMainThread");
		System.out.println("After renaming: " + t);
		try{
			for(int i = 0; i < 5; i++){
				System.out.println(i);
				t.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Error: " + e);
		} 
	}
}