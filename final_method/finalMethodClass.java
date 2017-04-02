class A
{
	final void info()
	{
		System.out.println("final A-class info() method...");
	}
}
class B extends A
{
	//void info(){System.out.println("B-class method...");} // trying to everride final method, it'll throw error
}
class finalMethodClass
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.info();	
	}
}