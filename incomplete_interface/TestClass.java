abstract class Abstract implements Interface
{
	protected int temp;
	public void hello()
	{
		System.out.println("Hello from Abstract class!");
	}
	//void show(){} // doesn't implement this method of interface
}
abstract class Child1 extends Abstract implements Interface
{
	public void hello()
	{
		System.out.println("Hello from Abstract's child1!");	
	}
	//void show(){} // abstract derived class can not to implemet the whole inteface too
}
class Child2 extends Abstract implements Interface
{
	public void hello()
	{
		System.out.println("Hello from Abstract's child2!");
	}
	public void show(){System.out.println("temp: " + temp);} // this method might be implemented because this class is not abstract and must implement the whole interface
}
class TestClass
{
	public static void main(String[] args) 
	{
		Child2 chld2 = new Child2();
		chld2.hello();
		chld2.show();	
	}
}