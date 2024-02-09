import java.util.Scanner;
public class ArrayStat {
    
	public static void main(String[] args)
	{
		int n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements in array: ");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter "+n+" elements of array a: ");
		for(int i=0 ; i<n ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements are: ");
        sc.close();
		for(int i=0 ; i<n ; i++)
		{
			System.out.print(a[i] +"\t");
		}
		for(int i=0 ; i<n ; i++)
		{
			for(int j=i+1 ; j<n ; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\n Min value is: "+a[0]+"\n Max value is: "+a[n-1]);
	}

}
