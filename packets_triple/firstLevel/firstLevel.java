package firstLevel;
class firstLevel
{
	static{
		System.out.println("First level");
	}
	public static void main(String[] args) 
	{
		firstLevelOne one = new firstLevelOne();
		firstLevelTwo two = new firstLevelTwo();
		one.info();	
		two.info();
	}
}
class firstLevelOne
{
	private int a;
	public void info()
	{
		System.out.println("field value a: " + a);
	}
}
class firstLevelTwo
{
	private int b;
	public void info()
	{
		System.out.println("field value b: " + b);
	}
}