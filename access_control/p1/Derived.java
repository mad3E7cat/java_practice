package p1;
class Derived extends Protection
{
	Derived()
	{
		System.out.println("____________________________");
		System.out.println("Derived class constructor...");
		System.out.println("default(unmodifyed) n = " + n);
		//System.out.println("private pri_n = " + pri_n); // mistake - accessible only from base class
		System.out.println("protected pro_n = " + pro_n);
		System.out.println("public pub_n = " + pub_n);
		System.out.println("____________________________");
	}
}