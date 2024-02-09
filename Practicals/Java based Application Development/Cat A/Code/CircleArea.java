public class CircleArea
{
	public static void main (String[] args)
	{
		double r, a,p ;
		r = Double.parseDouble(args[0]);
		a = Math.PI*r*r;
		p = 2*Math.PI*r;
		System.out.println("Area of circle with radius r = "+r+" is "+a);
        System.out.println("Perimeter of circle with radius r = "+r+" is "+p);
	}
}
