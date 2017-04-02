class A
{
	public void info()
	{
		System.out.println("A class mathod");
	}
}
class B extends A
{
	public void info()
	{
		System.out.println("B class method");
	}
}
class C extends A
{
	public void info()
	{
		System.out.println("C class method");
	}
}
class dinamicMethodClass
{
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		C c = new C();
		A r; // link to A class
		r = a;
		r.info();
		//
		r = b;
		r.info();
		//
		r = c;
		r.info();
	}
}