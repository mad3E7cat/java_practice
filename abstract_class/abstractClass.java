abstract class A
{
	abstract void info();
	void show()
	{
		System.out.println("Concrete method from abstract class...");
	}
} 
class B extends A
{
	void info()
	{
		System.out.println("Info B-method...");
	}
}
class abstractClass
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.show();
		b.info();
	}
}