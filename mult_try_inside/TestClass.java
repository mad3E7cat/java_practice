class TestClass{
	public static void main(String[] args) {
		try{
			int a = args.length;
			int b = 42/a;
			System.out.println("a = " + a);
			try{
				if(a == 1){ // if 1 param it'll throw zero division
					b = b/(a-a); // zero division
				} 
				if(a == 2){ // if 2 params it'll throw array out of bounds
					int c[] = {25};
					c[ 4 ] = 45;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Error_inner: " + e);
			}
		}catch(ArithmeticException e){
			System.out.println("Error_outer: " + e);
		}
	}
}