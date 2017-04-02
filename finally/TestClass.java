class TestClass{
	static void meth1(){
		try{
			System.out.println("meth1() in process...");
			throw new ArithmeticException("thrown from meth1()");
		}finally{
			System.out.println("meth1() finally block...");
		}
	}
	static void meth2(){
		try{
			System.out.println("meth2() in process...");
			return;
		}finally{
			System.out.println("meth2() finally block...");	
		}
	}
	static void meth3(){
		try{
			System.out.println("meth3() in process...");
		}finally{
			System.out.println("meth3() finally block...");
		}
	}
	public static void main(String[] args) {
		try{
			meth1();
		}catch(ArithmeticException e){
			System.out.println("Exception: " + e);
		}
		meth2();
		meth3();
	}
}