class TestClass implements InterfaceConstants
{
	static void answer(int result)
	{
		switch(result)
		{
			case NO:
				System.out.println("No.");
				break;
			case LATER:
				System.out.println("Later...");
				break;
			case MAYBE:
				System.out.println("Maybe...");
				break;
			case SOON:
				System.out.println("Soon...");
				break;
			case YES:
				System.out.println("Yes!");
				break;
			case NEVER:
				System.out.println("Never.");
				break;
		}
	}
	public static void main(String[] args) 
	{
		QuestionClass q = new QuestionClass();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());	
	}
}