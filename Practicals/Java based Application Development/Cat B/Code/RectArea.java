import java.util.Scanner;
class Area
{
	double l, b;
	Area()
	{
		l=25.3;
		b=67;
	}
	Area(double l, double b)
	{
		this.l=l;
		this.b=b;
	}
	public String calArea()
	{
		return("Area of rectangle with length= "+l+" and breadth= "+b+" is"+(l*b));
	}
}

class RectArea
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double i=sc.nextDouble();
		System.out.println("Enter breadth: ");
		double j=sc.nextDouble();
        sc.close();
		Area a=new Area();
		System.out.println("Default constructor: "+a.calArea());
		a=new Area(i,j);
		System.out.println("Parametrized constructor: "+a.calArea());
	}
}
