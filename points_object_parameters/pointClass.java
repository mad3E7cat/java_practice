class pointClass
{
	public static void main(String[] args) 
	{
		Point point1 = new Point(3,3,3);
		Point point2 = new Point(1,2,3);
		Point point_sum = new Point();
		Point point_mul = new Point();
		System.out.println("poin1 + point2:");
		point_sum = point1.sum(point2);
		point_sum.output();
		System.out.println("point1 * point2");
		point_mul = point1.mult(point2);
		point_mul.output();
		System.out.println("copying point1 into point_cp:");
		Point point_cp = new Point(point1);
		point_cp.output();
		System.out.println("");
		
	}
}
class Point
{
private
	int x;
	int y;
	int z; 
public
	Point()  // empty constructor
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	Point(int _x, int _y, int _z) // constructor
	{
		this.x = _x;
		this.y = _y;
		this.z = _z;
	}
	Point(Point obj)
	{
		this.x = obj.x;
		this.y = obj.y;
		this.z = obj.z;
	}
	Point sum(Point obj)
	{
		Point p_t = new Point();
		p_t.x = (this.x + obj.x);
		p_t.y = (this.y + obj.y);
		p_t.z = (this.z + obj.z);
		return p_t;
	}
	Point mult(Point obj)
	{
		Point p_t = new Point();
		p_t.x = (this.x * obj.x);
		p_t.y = (this.y * obj.y);
		p_t.z = (this.z * obj.z);
		return p_t;
	}
	void output()
	{
		System.out.print("\nX: " + this.x + "\nY: " + this.y + "\nZ: " + this.z + "\n");
	}
}