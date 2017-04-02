final class A // this "final" protects A-class from inheritance 
{
	int a;
	void show(){System.out.println("a: " + a);}

}
 // class B extends A {} // error: trying to inherit the final class
class finalClass
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.show();	
	}
}