class forEachClass
{
	public static void main(String[] args) 
	{
		int nums[] = {45,67,3,2,1,457,8,65,8,79,56,34,2};
		int sum = 0;
		int i = 0;
		for(int x:nums)
		{
			i++;
			sum += x;
			System.out.println("nums[" + i +"] = " + x);
		}
		System.out.println("SUM = " + sum);	
	}
}