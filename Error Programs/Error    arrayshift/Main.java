import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int arr[] = new int[100];
		int i,size,j,count=0,s[] = new int[100],shift;
		
		System.out.print("Enter Size of array:");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		for(i=0;i<size;i++)
		{
			System.out.print("Enter value no " + (i+1) + ":");
			arr[i] = sc.nextInt();
		}

		System.out.println("List of array");
		
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.print("Enter no for shifting:");
		shift = sc.nextInt();

		for(i=0;i<shift;i++)
		{
			s[i] = arr[i];
		}

		for(i=0;i<size-shift;i++)
		{
			arr[i]=arr[i+shift];
		}

		for(;i<size;i++)
		{
			arr[i]=s[count];
			count++;
		}
		
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}