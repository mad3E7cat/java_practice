class TestClass{
	static void test() throws ArithmeticException{ // we say that exception will be thrown but won't be handled
		System.out.println("test() method launched...");
		throw new ArithmeticException("demo");
	}
	public static void main(String[] args) {
		try{
			test();
		}catch(ArithmeticException e){
			System.out.println("Exception: " + e);
		}
	}
}