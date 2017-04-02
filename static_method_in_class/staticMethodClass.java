class staticMethodClass
{
	public static void main(String[] args) 
	{
		testClass.out();
	}
}
class testClass
{
	private static int a = 100;
	public static void out()
	{
		System.out.println("a = " + a);
	}
}