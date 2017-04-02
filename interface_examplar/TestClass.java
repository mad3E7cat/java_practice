class A implements Interface
{
	private int a;
	void hello() {System.out.println("Hello");}
	public void show()
	{
		System.out.println("a: " + a);
	}
	A(int _a) {a = _a;}
}
class B implements Interface
{
	private int b;
	void hello() {System.out.println("Hello");}
	public void show()
	{
		System.out.println("b: " + b);
	}
	B(int _b) {b = _b;}	
}
class C
{
	private int c;
	void hello() {System.out.println("Hello");}
	void info()
	{
		System.out.println("c: " + c);
	}
	C(int _c) {c = _c;}
}
class TestClass
{
	public static void main(String[] args) 
	{
		Interface inter;
		inter = new A(10);
		//inter.hello(); // mistake - interface variable cannot call non-interface members of class
		inter.show();
		inter = new B(11);
		//inter.hello(); // mistake - interface variable cannot call non-interface members of class 
		inter.show();
		//inter = new C(12); // mistake - C-class doesn't implement Interface 
	}
}