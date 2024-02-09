import java.util.Scanner;
class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		double i = sc.nextDouble();
		System.out.println("Enter the 2nd number: ");
		double j = sc.nextDouble();
        sc.close();
		Arithmetic a=new Arithmetic();
		System.out.println(a.add(i,j));
		System.out.println(a.sub(i,j));
		System.out.println(a.multi(i,j));
		System.out.println(a.div(i,j));
	}
}
