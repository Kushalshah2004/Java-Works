import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		byte arr[] = {1,2,3,4,5};
		byte arr1[] = new byte[5];
		int i,j,shift;
		byte temp=5;

		Scanner sc = new Scanner(System.in);
	
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.print("Enter shift number:");
		shift = sc.nextInt();

		j=0;

		for(i=temp-shift;i<temp;i++)
		{
			arr1[j] = arr[i];
			j++;
		}

		for(i=0;i<temp-shift;i++)
		{
			for(j=0;j<5;i++)
			{
				arr[j+1] = arr[j];
			}
		}

		j=0;

		for(i=0;i<shift;i++)
		{
			arr[i] = arr1[j];
			j++;
		}
		
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}

	}
}