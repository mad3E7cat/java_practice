class MyException extends Exception{
	private int detail;
	MyException(int a){
		detail = a;
	}
	public String toString(){
		return "MyException [" + detail + "]"; 
	}
}
//
class TestClass{
	static void demo(int a) throws MyException{
		System.out.println("Called with " + a);
		if(a > 10){
			throw new MyException(a);
		}
		System.out.println("Normal.");
	}
	public static void main(String[] args) {
		try{
			demo(1);
			demo(20);
		}catch(MyException me){
			System.out.println("Caught: " + me); // 'me' in println calls overriden toString()
		}
	}
}
