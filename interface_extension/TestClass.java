interface A 
{
	void method1();
	void method2();
}
interface B extends A
{
	void method3();
}
class Test implements B
{
	public void method1()
	{
		System.out.println("Method1 in process...");
	}
	public void method2()
	{
		System.out.println("Method2 in process...");
	}
	public void method3()
	{
		System.out.println("Method3 in process...");
	}
}
class TestClass
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.method1();
		t.method2();
		t.method3();	
	}
}