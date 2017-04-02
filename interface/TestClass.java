class A implements TestInterface
{
	protected String name;
	protected int age;
	A(String _name, int _age)
	{
		name = _name;
		age = _age;
	}
	public void nameOut() // all methods implementing interface should be public
	{
		System.out.println("name: " + name);
	}
	public void ageOut()
	{
		System.out.println("age: " + age);	
	}
}
class B extends A implements TestInterface
{
	private String surname;
	B(String _name, String _surname, int _age)
	{
		super(_name, _age);
		surname = _surname;
	}
	public void nameOut()
	{
		System.out.println("name: " + name + "\nsurname: " + surname);
	}
}
class TestClass
{
	public static void main(String[] args) 
	{
		A a = new A("Alex", 19);
		B b = new B("Alex", "Chernenkov", 19);	
		a.nameOut();
		a.ageOut();
		System.out.println("");
		b.nameOut();
		b.ageOut();
	}
}