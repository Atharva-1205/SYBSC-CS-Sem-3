
import java.util.Scanner;
public class CheckVowelSpecial {
    

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");

		String c = sc.next().toLowerCase();
		char ch = c.charAt(0);
        sc.close();
		if(ch>='a' && ch<='z')
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch+" is a vowel");
			}
			else
			{
				System.out.println(ch+" is a consonant");
			}
		}
		else if(ch>='0' && ch<='9')
		{
		System.out.println(ch+" is a number");
		}
		else
		{
		System.out.println(ch+" is a special character");
		}
	}
}
