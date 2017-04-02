class TestClass{
	public static void main(String[] args) {
		try{
			int b = 100/0;
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		/*
		this code is unreachable because ArithmeticException is sublass of Exception
		and Exception handler will handle Exception object 'e' and close the whole try/catch block
		catch(ArithmeticException e){
			System.out.println("Error: " + e);
		}
		any catch, handling the subclass should go firstly, only then the 
		parent class exception should be handled
		*/
	}
}