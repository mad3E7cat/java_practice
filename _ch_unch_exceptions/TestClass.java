import java.lang.*;
class TestClass{
	static void throw_unchecked() throws ClassNotFoundException{
		throw new ClassNotFoundException("unchecked");
	}
	static void throw_checked(){
		try{
			throw new ArithmeticException("checked");
		}catch(ArithmeticException a){
			System.out.println("Error: " + a);
		}
	}
	public static void main(String[] args) {
		try{
			throw_unchecked();
		}catch(ClassNotFoundException a){
			System.out.println("Error: " + a);
		}
		throw_checked();
	}
}
//System.out.println("Error: " + a);