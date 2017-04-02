class recFactorial
{
	public static void main(String[] args) 
	{
		Factorial f = new Factorial();
		System.out.println("6! = " + f.fact(6));
		System.out.println("10! = " + f.fact(10));
		System.out.println("20! = " + f.fact(20));
		System.out.println("40! = " + f.fact(35));
	}
}
class Factorial
{
	long fact(long n)
	{
		long result;
		if(n == 1) return 1;
		result = fact(n - 1) * n;
		return result;
	}
}