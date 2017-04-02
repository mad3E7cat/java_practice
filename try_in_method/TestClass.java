/*
this can throw exceptions in 3 ways:
1. 0 params in main: zero dovosion exception is thrown from main
2. 1 param in main: zero division exception is thrown from method but caught in main
3. 2 params in main: array out of bounds exception thrown and caught in method
*/
class TestTry{
	public void test(int a){
		try{
			if(a == 1){
				int b = a/(a-a); // zero division if 1 param to main()
			}
			if(a == 2){
				int c[] = {34};
				c[ 2 ] = 0; // array index out of bounds if 2 params to main()
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error_in_method_caught:" + e);
		}
	}
}
class TestClass{
	public static void main(String[] args) {
		TestTry tsttr = new TestTry();
		int a = args.length;
		try{
			int b = a/a; // zero division if 0 params
			System.out.println("a = " + a);
			tsttr.test(a);
		}catch(ArithmeticException e){
			System.out.println("Error_in_main_caught: " + e);
		}
	}
}
