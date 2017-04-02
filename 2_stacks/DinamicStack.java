class DinamicStack implements IntStack
{
	private int stck[];
	private int tos;
	DinamicStack(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	public void push(int x)
	{
		if(tos == stck.length - 1)
		{
			int temp[] = new int[stck.length * 2];
			for (int i = 0; i < stck.length; i++) temp[ i ] = stck[i];
			stck = temp;
			stck[++tos] = x;	
		}
		else
		{
			stck[++tos] = x;
		}
	}
	public int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			return stck[tos--];
		} 
	}
}
class DinamicTest
{
	public static void main(String[] args) 
	{
		DinamicStack dinStck1 = new DinamicStack(5);
		DinamicStack dinStck2 = new DinamicStack(8);
		for (int i = 0; i < 10; i++) 
		{
			dinStck1.push(i);	
		}
		for (int i = 0; i < 15; i++) 
		{
			dinStck2.push(i);	
		}
		System.out.println("Stack1:");
		for (int i = 0; i < 11; i++) System.out.println(dinStck1.pop()); 
		System.out.println("Stack2:");
		for (int i = 0; i < 16; i++) System.out.println(dinStck2.pop());	
	}
}