import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int arr1[] = new int[100];
		int arr2[] = new int[100];
		int Finalarr[] = new int[200];
		int i,j,size1,size2,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of first array:");
		size1 = sc.nextInt();
		for(i=0;i<size1;i++)
		{
			System.out.print("Enter valye no" + (i+1) + ":");
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter size of second array:");
		size2 = sc.nextInt();
		for(i=0;i<size2;i++)
		{
			System.out.print("Enter valye no" + (i+1) + ":");
			arr2[i] = sc.nextInt();
		}
		System.out.println("Array 1 before sort");
		for(i=0;i<size1;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Array 2 before sort");
		for(i=0;i<size2;i++)
		{
			System.out.println(arr2[i]);
		}
		for(i=0;i<size1;i++)
		{
			for(j=i+1;j<size1;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		for(i=0;i<size2;i++)
		{
			for(j=i+1;j<size2;j++)
			{
				if(arr2[i]>arr2[j])
				{
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		/*System.out.println("Array 1 After sort");
		for(i=0;i<size1;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Array 2 After sort");
		for(i=0;i<size2;i++)
		{
			System.out.println(arr2[i]);
		}*/
		int size3 = size1+size2;
		for(i=0;i<size3;i++)
		{
			if(arr1[i]<arr2[i])
			{
				Finalarr[i] = arr1[i];
				Finalarr[i+1] = arr2[i];
			}
			else
			{
				Finalarr[i] = arr2[i];
				Finalarr[i+1] = arr1[i];
			}
		}
		for(i=0;i<size3;i++)
		{
			System.out.println(Finalarr[i]);
		}
	}
}