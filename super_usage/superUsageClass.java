class Worker
{
	protected String name;
	protected int age;
	protected int salary;
	public Worker()
	{
		name = "";
		age = 0;
		salary = 0;
	}
	public Worker(String _name, int _age, int _salary)
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
	private int coefficient;
	private int experience;
	public Programmer()
	{
		super(); // calls empty constructor of Worker
	}
	public Programmer(String _name, int _age, int _salary, int _experience)
	{
		super(_name, _age, _salary); // calls constructor of Worker
		experience = _experience;
		coefficient = experience * 1; // coefficient is equal to experience, 'cause just multiplied with 1
		salary = (coefficient == 0) ? salary : (salary * coefficient);
	}
}
class superUsageClass
{
	public static void main(String[] args) 
	{
		Worker wrk1 = new Worker("Alex", 19, 30000);
		Programmer prgr1 = new Programmer("Alex", 19, 30000, 0);
		wrk1.info();
		prgr1.info();
	}
}