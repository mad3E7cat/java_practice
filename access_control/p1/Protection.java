package p1;
public class Protection
{
	int n = 1;
	private int pri_n = 2;
	protected int pro_n = 3;
	public int pub_n = 4;
	public Protection()
	{
		System.out.println("____________________________");
		System.out.println("Base class constructor...");
		System.out.println("default(unmodifyed) n = " + n);
		System.out.println("private pri_n = " + pri_n);
		System.out.println("protected pro_n = " + pro_n);
		System.out.println("public pub_n = " + pub_n);
		System.out.println("____________________________");
	}
}