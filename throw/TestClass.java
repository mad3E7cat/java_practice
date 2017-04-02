class TestClass{
	static void demo(){
		try{
			throw new NullPointerException("demo thrown");
		}catch(NullPointerException e){
			System.out.println("Caught in demo()");
			throw e; // the exceprion will be given into main() after being handled
		}
	}
	public static void main(String[] args) {
		try{
			demo();
		}catch(NullPointerException e){
			System.out.println("Caught in main(): " + e);
		}
	}
}
