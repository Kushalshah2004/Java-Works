import java.util.InputMismatchException;  
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc =  new Scanner(System.in);
		try
		{
			System.out.println("Enter A:");
			a = sc.nextInt();
			System.out.println("Enter B:");
			b = sc.nextInt();
			c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException occure");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException occure");
		}
		catch(Exception e)
		{
			System.out.println("Exception occure");
		}
	}
}