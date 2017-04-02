class staticBlock
{
	static int a = 6;
	static int b;
	static{
		b = a >> 2; // 6(dec) >> 2 = 110(bin) >> 2 = 001(bin) = 1(dec)
		System.out.println("Static block proceeded...");
	}
	static void output()
	{
		System.out.println("\na = " + a + "\nb = " + b);
	}
	public static void main(String[] args) 
	{
		output();
	}

}