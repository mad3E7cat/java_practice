//other class(no inheritance) trying to access fields of class from other package
package p2;
import p1.Protection;
class OtherPackage
{
	OtherPackage()
	{
		System.out.println("___________________________");
		p1.Protection p = new p1.Protection();
		//System.out.println("default(unmodifyed) n = " + p.n); // mistake - available only for current class or same package
		//System.out.println("pri_n = " + p.pri_n); // mistake - available only for current class
		//System.out.println("pro_n = " + p.pro_n); // mistake - available only for current class, derived class or !same package!
		System.out.println("pub_n = " + p.pub_n);
		System.out.println("___________________________");
	}
}