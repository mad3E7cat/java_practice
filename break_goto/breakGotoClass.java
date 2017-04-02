class brakGotoClass
{
	public static void main(String[] args) 
	{
		outer_cycle: // mark for th outer cycle
		for(int i =0; i < 100; i++)
		{
			System.out.print("Cycle step #" + i + ":");
			for(int j = 0; j <= 10; j++)
			{
				System.out.print(j + " ");
			}
			if(i == 2) break outer_cycle;
			System.out.println("");
		}
		System.out.println("");	
	}
}