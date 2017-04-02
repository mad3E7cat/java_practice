class TestClass{
	public static void main(String[] args) {
		try{
			int a = args.length;
			int b = 100 / a; // if no arguments, it'll be division by zero
			int c[] = {255};
			c[ 2 ] = 668; // c[2] doesn't exist
		}catch(ArithmeticException e)
		{
			System.out.println("Error: " + e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: " + e); // if there are arguments it'll throw out of bounds exception
		} 	
	}
}