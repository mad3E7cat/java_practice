class A
{
	public interface boolCheck
	{
		boolean check(int x);
	}
}
class B implements A.boolCheck
{
	public boolean check(int x)
	{
		return x < 0 ? false : true; 	
	}
}
class TestClass
{
	public static void main(String[] args) 
	{
		A.boolCheck inInter = new B(); // inner interface variable can be assigned to the link of class B
		System.out.println(inInter.check(-10));
		System.out.println(inInter.check(110));	
	}
}