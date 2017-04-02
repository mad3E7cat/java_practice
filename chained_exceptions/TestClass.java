class TestClass{
	static void demo(){
		NullPointerException e = new NullPointerException("Upper level...");
		e.initCause(new ArithmeticException("reason..."));
		throw e;
	}
	public static void main(String[] args) {
		try{
			demo();
		}catch(NullPointerException e){
			System.out.println("Caught: " + e);
			System.out.println("Reason: " + e.getCause());
		}
	}
}