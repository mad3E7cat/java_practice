class A
{
	protected int a;
	A()
	{
		a = 100;
	}
	public void show()
	{
		System.out.println("field \"a\" equals " + a);
	}
}
class B extends A
{
	private int b;
	B()
	{
		super();
		b = 200;
	}
	public void show()
	{
		super.show();
		System.out.print(" and field \"b\" equals " + b);
	} 
}
class superMethodClass
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		a1.show();
		b1.show();
	}
}