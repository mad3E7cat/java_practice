package p1;
class SamePackage
{
	SamePackage()
	{
		System.out.println("____________________________");
		Protection p = new Protection();
		System.out.println("Base class constructor from SamePackage class...");
		System.out.println("SamePackage class constructor...");
		System.out.println("default(unmodifyed) n = " + p.n);
		//System.out.println("private pri_n = " + pri_n); // mistake - accesible only from base class
		System.out.println("protected pro_n = " + p.pro_n);
		System.out.println("public pub_n = " + p.pub_n);
		System.out.println("____________________________");
	}
}