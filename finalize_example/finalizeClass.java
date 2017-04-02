class finalizeClass
{
	public static void main(String[] args) 
	{
		System.out.println("Finalizer: ");	
		Test myTest = new Test();
		myTest.say();
		//myTest = null;
	}
}
class Test
{
private
	int a;
	double c;
public
	void say()
	{
		System.out.println("Hello");
	}
protected
	void finalaize()
	{
		System.out.println("Finalization, object is being deleted...");
	}
}