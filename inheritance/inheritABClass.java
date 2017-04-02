class Worker
{
	protected String name;
	protected int age;
	protected int salary;
	Worker()
	{
		name = "";
		age = 0;
		salary = 0;
	}
	Worker(String _name, int _age, int _salary)
	{
		name = _name;
		age = _age;
		salary = _salary;
	}
	public void info()
	{
		System.out.println("\nName: " + name + "\nAge: " + age + "\nSalary: " + salary);
	}
}
class Programmer extends Worker
{
	private int coefficent;
	private int experience;
	Programmer()
	{
		name = "";
		age = 0;
		salary = 0;	
	}
	Programmer(String _name, int _age, int _salary, int _experience)
	{
		name = _name;
		age = _age;
		coefficent = _experience * 1; // here coefficent is just an experience multyplied with 1
		salary = (coefficent == 0) ? _salary : _salary * coefficent;
	}
}
class inheritABClass
{
	public static void main(String[] args) 
	{
		Worker wrk1 = new Worker("Alex", 19, 30000);
		Programmer prgr1 = new Programmer("Alex", 19, 30000, 3);
		wrk1.info();
		prgr1.info();
	}	
}