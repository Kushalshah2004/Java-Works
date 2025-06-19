import java.util.InputMismatchException;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{	
		float n=0;
		
		byte i;
		
		String str;
				
		float arr[] = new float[10];
		
		Table tab = new Table();

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		try
		{
			System.out.println("Do you want to print table in specific range??\nif Yes then press any key else Press  N or n");
			
			str = sc.nextLine();
			
			if(str != "N" || str != "n")
			{
				float si,li;
				int j=0;
			
				try
				{
					System.out.print("Enter staring index:");
					si = sc.nextFloat();
					
					System.out.print("Enter ending index:");
					li = sc.nextFloat();	
		
					if( (n = li-si) <10)
					{
						float tempsi = si;
			
						for(i=(byte)si;i<=(byte)li;i++)
						{
							arr[j] = tempsi;
							j++;
							tempsi++;						
						}

						MyThread t1[] = new MyThread[10];

						for(i=0;i<n;i++)
						{
							t1[i] = new MyThread(arr[i],tab);
						}
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println("InputMismatchException occure");
				}	
			
			}

	
			else
			{
				try
				{
				
					System.out.print("Enter number of table you want to print:");
						n = sc.nextFloat();
			
						n = Math.round(n);
						System.out.println("N= " + n);
			
						for(i=0;i<n;i++)
						{
							System.out.print("Enter value no " + (i+1) + " : ");
							arr[i] = sc.nextFloat();
						}		
					
					MyThread t1[] = new MyThread[10];
					
					for(i=0;i<n;i++)
					{
						t1[i] = new MyThread(arr[i],tab);
					}	
		
				}
			
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("ArrayIndexOutOfBoundException occure");
				}			
	
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException occure");
		}
		
		

	}
}