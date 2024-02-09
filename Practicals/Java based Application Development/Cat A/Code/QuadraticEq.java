import java.util.Scanner;

public class QuadraticEq {
    
	public static void main(String[] args)
	{
		double a, b, c, root1, root2;
		System.out.println("For given equation ax^2+bx+c");
		System.out.print("Enter a: ");
		Scanner sc=new Scanner(System.in);
		a = sc.nextDouble();
		System.out.print("\nEnter b: ");
		b = sc.nextDouble();
		System.out.print("\nEnter c: ");
		c = sc.nextDouble();
		double d=(b*b)-(4*a*c);
		System.out.println("Discriminant= "+d);
        sc.close();
		if(d>0)
		{
			System.out.println("Roots are real and they are unequal");
			root1 = (-b+Math.sqrt(d))/(2*a);
			root2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println("Root1= "+root1);
			System.out.println("Root2= "+root2);
		}
		else if(d==0)
		{
			System.out.println("Roots are real and they are equal");
			root1 = (-b+Math.sqrt(d))/(2*a);
			System.out.println("Root1= "+root1);
		}
		else
		{
			System.out.println("Roots are IMAGINARY");
		}
	}
	

}
