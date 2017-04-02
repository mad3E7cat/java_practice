class A
{
	private int a;
	private int b;
	A(int _a, int _b)
	{
		a = _a;
		b = _b;
	}
	public String toString()
	{
		return "a: " + a + "\nb: " + b;
	}
}
class toStringClass
{
	public static void main(String[] args) 
	{
		A a = new A(10, 10);
		System.out.println(a.toString());
	}
}