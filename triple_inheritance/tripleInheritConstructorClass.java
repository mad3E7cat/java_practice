class A
{
	A()
	{
		System.out.println("A-class constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B-class constructor");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C-class constructor");
	}
}
class tripleInheritConstructorClass
{
	public static void main(String[] args) 
	{
		C c = new C(); 	
	}
}