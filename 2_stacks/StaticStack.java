class StaticStack implements IntStack
{
	private int stck[];
	private int tos;
	StaticStack(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	public void push(int x)
	{
		if(tos == stck.length - 1) System.out.println("Stack is full...");
		else stck[++tos] = x;
	}
	public int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack is empty...");
			return -1;
		} 
		else
		{
			return stck[tos--];
		}
	}
}
