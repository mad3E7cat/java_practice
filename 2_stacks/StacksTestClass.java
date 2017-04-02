class StacksTestClass
{
	public static void main(String[] args) 
	{
		IntStack interVar;
		StaticStack stStck = new StaticStack(5);
		DinamicStack dinStck = new DinamicStack(8);
		//
		System.out.println("Static stack: ");
		interVar = stStck;
		for(int i = 0; i < 5; i++) interVar.push(i);
		for(int i = 0; i < 5; i++) System.out.println(interVar.pop());
		//
		System.out.println("Dynamic stack:");	
		interVar = dinStck;
		for(int i = 0; i < 8; i++) interVar.push(i);
		for(int i = 0; i < 9; i++) System.out.println(interVar.pop()); 	
	}
}