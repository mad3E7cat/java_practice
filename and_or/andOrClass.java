class andOrClass
{
	public static void main(String[] args) 
	{
		int denom = 0;
		int num = 130;
		// error is in using single & symbol, it makes the compiler to check the right part of expression which contains division by zero
		// if(denom != 0 & num/denom > 10)
		// {
		// 	System.out.println("OK");
		// }
		//
		// this is the right expression, because it doesn't check the right part of it, because of && symbol usage
		if(denom != 0 && num/denom > 10)
		{
			System.out.println("OK");
		}
		else
		{
			System.out.println("Division by zero!");
		}
	}
}