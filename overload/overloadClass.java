class overloadClass
{
	public static void main(String[] args) 
	{
		sumOverloadedClass oc = new sumOverloadedClass();
		int a = 10, b = 15;
		double c = 10.45, d = 34.09;
		String e = "hello, ", f = "bitch!";
		System.out.println("INT-overloaded sum(a,b): " + oc.sum(a,b));
		System.out.printf("DOUBLE-overloaded sum(c,d): %.4f\n", oc.sum(c,d)); // for acuracy setting with %.4f
		System.out.println("STRING-overloaded sum(e,f): " + oc.sum(e,f));
	}
}
class sumOverloadedClass
{
public
	double sum(double a, double b)
	{
		return (a + b); 
	}
	int sum(int a, int b)
	{
		return (a + b);
	}
	String sum(String a, String b)
	{
		return (a + b);
	}
}
