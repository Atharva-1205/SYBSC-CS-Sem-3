import java.util.Scanner;

public class SumOfDigits {
    
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, no, r, sum=0;
		System.out.println("Enter a number: ");
		no = sc.nextInt();
        sc.close();
		n = no;
		while(n>0)
		{
			r = n%10;
			sum = sum+r;
			n = n/10;
		}
		System.out.println("Sum of digits of "+no+" is "+sum);
	}
}
