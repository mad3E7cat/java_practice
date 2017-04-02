package secondLevel;
class secondLevel
{
	static{
		System.out.println("Second level");
	}
	public static void main(String[] args) 
	{
		secondLevelOne one = new secondLevelOne();
		secondLevelTwo two = new secondLevelTwo();
		one.info();
		two.info();	
	}
}
class secondLevelOne
{
	private int a;
	public void info()
	{
		System.out.println("field value a: " + a);
	}
}
class secondLevelTwo
{
	private int b;
	public void info()
	{
		System.out.println("field value b: " + b);
	}
}