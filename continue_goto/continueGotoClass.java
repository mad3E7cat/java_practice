class continueGotoClass
{
	public static void main(String[] args) 
	{
		outer_cycle:
		for(int i = 0; i < 10; i++)
		{
			inner_cycle:
			for(int j = 0; j < 10; j++)
			{
				if((i % 2) == 0)
				{ 
					System.out.print(" *");
					continue inner_cycle; 
				}
				if(i % 3 == 0)
				{
					System.out.print("#");
					continue outer_cycle; 
				}
				System.out.print(" " + j);
			}
			System.out.println("");
		}	
	}
}