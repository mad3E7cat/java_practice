import java.util.Date; 
class dateCmdClass
{
	static Date dt = new Date();
	static long secs = dt.getTime();
	static void seconds()
	{
		System.out.println(secs + " seconds since midnight of Jan 1st, 1970");
	}
	static void date()
	{
		System.out.println("Today:\n" + dt.toString());
	}
	public static void main(String[] args) 
	{
		if(args.length != 0)
		{
			if((args[0].equals("-s")) && (args.length == 1))
			{
				seconds();
			}
			if((args[0].equals("-d")) && (args.length == 1))
			{
				date();
			}
			else if(args.length > 1)
			{
				System.out.println("Wrong parameters!");
				System.out.println("Usage: \njava dateCmdClass -s \n or\njava dateCmdClass -d");
			}
		}
		else
		{
			System.out.println("Error! No parameters!");
			System.out.println("Usage: \njava dateCmdClass -s \n or\njava dateCmdClass -d");
		}
	}

}