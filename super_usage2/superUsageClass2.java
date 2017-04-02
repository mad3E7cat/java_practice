class A
{
	protected int groupID;
	public void info()
	{
		System.out.println("GroupID(A): " + groupID + "\n");
	}
}
class B extends A
{
	//protected int groupID;
	public B() { groupID = 0; }
	public B(int gid) { groupID = gid; } 
	public void parentGIDChange()
	{
		super.groupID = 1000;
		groupID = super.groupID;
		System.out.println("gid changed to parent... " + super.groupID);
	}
	public void info()
	{
		System.out.println("GroupID(B): " + this.groupID + "\n");
	}
}
class superUsageClass2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B(1337);
		a1.info();
		b1.info();
		b1.parentGIDChange();
		b1.info();
		a1.info();
	}
}