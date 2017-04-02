public class First
{
	//
	public static void hello()
	{
		System.out.println("Hello, world!");
	}
	//
	public static void main(String[] args)
	{
		//System.out.println("Hello, world!");
		//hello();
		System.out.println("\"While\"-cycle example:");
		int x = 7;
		while(x > 0)
		{
			if((x % 2) != 0)
			{
				System.out.print(x + " : ");
				hello();
			}
			x -= 1;
		}
		System.out.println(" ");
		System.out.println("\"For\"-cycle example:");
		for(int i = 0; i < 10; i += 1)
		{
			if((i % 2) == 0)
			{
				System.out.print(i + " : ");
				hello();
			}
		}
	}
}