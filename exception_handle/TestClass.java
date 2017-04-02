import java.util.Random;
class TestClass
{
	public static void main(String[] args) 
	{
		int a = 0, b = 0, c = 0;
		Random r = new Random();
		for(int i = 0; i < 32000; i++)
		{
			try
			{
				b = r.nextInt();
				c = r.nextInt();
				a = 1337/(b/c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero: " + e);
				a = 0;
			}
			System.out.println("a = " + a);
		}
	}
}