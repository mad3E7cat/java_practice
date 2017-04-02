class varParClass
{
	static void vTest(int ... v)
	{
		System.out.print("Number of arguments: " + v.length);
		System.out.print(" They are: ");
		for(int x: v)
		{
			System.out.print(" " + x);
		}
		System.out.println("");
	}
	public static void main(String[] args) 
	{
		vTest(3,0,9);
		vTest();
		vTest(8,0);
		vTest(-5);
	}
}