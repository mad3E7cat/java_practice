class Figure
{
	protected double dim1;
	protected double dim2;
	Figure(double a, double b)
	{
		dim1 = a;
		dim2 = b;
	}
	double area()
	{
		System.out.println("Area is not initialized...");
		return 0;
	}
}
class Rectangle extends Figure
{
	Rectangle(double a, double b)
	{
		super(a, b);
	}
	double area()
	{
		System.out.println("Rectangle area...");
		return dim1 * dim2;
	}
}
class Triangle extends Figure
{
	Triangle(double a, double b)
	{
		super(a, b);
	}
	double area()
	{
		System.out.println("Triangle area...");
		return (dim1 * dim2) / 2;
	}
}
class figureClass
{
	public static void main(String[] args) 
	{
		Figure f = new Figure(5, 5);
		Rectangle r = new Rectangle(3, 3);
		Triangle t = new Triangle(4,5);
		Figure fig;	
		//
		fig = r;
		System.out.println("Area equals: " + fig.area());
		//
		fig = t;
		System.out.println("Area equals: " + fig.area());
		//
		fig = f;
		System.out.println("Area equals: " + fig.area());
	}	
}