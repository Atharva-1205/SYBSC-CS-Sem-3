import java.util.Scanner;

public class CheckCharCase {
  
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Character: ");

		String c = sc.next();
		char ch = c.charAt(0);
        sc.close();
		if(ch>=65 && ch<=90)
		{
		System.out.println(ch+" is Upper Case Character.");
		}
		else if(ch>=97 && ch<=122)
		{
		System.out.println(ch+" is Lower Case Character.");
		}
		else
		{
		System.out.println("Enter Character");
		}
	}

}
