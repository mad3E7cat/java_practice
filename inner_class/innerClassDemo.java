class innerClassDemo
{
	int X = 1337;
	void outerInTest()
	{
		Inner inner = new Inner();
		inner.innerDisplay();
	}
	class Inner
	{
		void innerDisplay()
		{
			System.out.println("outer X: " + X);
		}
	}
	public static void main(String[] args) 
	{
		innerClassDemo inOut = new innerClassDemo();
		inOut.outerInTest(); 	
	}
}