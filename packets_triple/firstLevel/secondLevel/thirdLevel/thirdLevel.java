package thirdLevel;
class thirdLevel
{
	static{
		System.out.println("Third level");
	}
	public static void main(String[] args) {
		thirdLevelOne one = new thirdLevelOne();
		thirdLevelTwo two = new thirdLevelTwo();
		one.info();
		two.info();
	}
}
class thirdLevelOne
{
	private int a;
	public void info()
	{
		System.out.println("field value a: " + a);
	}
}
class thirdLevelTwo
{
	private int b;
	public void info()
	{
		System.out.println("field value a: " + b);
	}
}