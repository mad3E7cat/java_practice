class foreach2DClass
{
	public static void main(String[] args) 
	{
		int nums[][] = new int[4][5];
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				nums[i][j] = (i*j) % 2;
			}
		}
		for(int x[]:nums)
		{
			for(int y:x)
			{
				System.out.print(" "+ y);
			}
			System.out.println("");
		}	
	}
}