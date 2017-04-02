class TestClass{
	public static void main(String[] args) {
		try{
			int a = args.length;
			int b = 10/a;
			int c[] = {244};
			c[ 4 ] = 10;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Error: "  + e);
		}
	}
}