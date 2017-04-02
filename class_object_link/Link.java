class Link
{
	public static void main(String[] args) 
	{
		Test myTest; // wrong!
		Test myTest = new Test(); // right
		System.out.println(myTest.a + " " + myTest.b);	
	}
}
class Test
{
	int a;
	int b;
}