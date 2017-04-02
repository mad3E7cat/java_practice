//inherits the class from other package and tries to access its fields 
package p2;
import p1.Protection;
class Protection2 extends p1.Protection
{
	Protection2()
	{
		System.out.println("____________________________________");
		System.out.println("Derived constructor from package1...");
		//System.out.println("default(unmodifyed) n = " + n); // mistake - available only for current class or same package with base class
		//System.out.println("pri_n = " + pri_n); // mistake - available only for current class
		System.out.println("pro_n = " + pro_n);
		System.out.println("pub_n = " + pub_n);
		System.out.println("____________________________________");
	}
}