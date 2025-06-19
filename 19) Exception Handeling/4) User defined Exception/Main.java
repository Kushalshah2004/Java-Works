import java.util.InputMismatchException;  
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int age;
		Scanner sc = new Scanner(System.in);
		Check ob = new Check();
		System.out.println("Enter Age:");
		try
		{
			age = sc.nextInt();
			ob.check(age);
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
			System.out.println(e);
		}
		catch(AgeException e)
		{
			System.out.println("AgeException");
			System.out.println("Message: " + e.getMessage());// if we write only e then jvm automatically call associated exception class  & call that class getMessage() 
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			System.out.println("Message: " + e.getMessage());
		}
	}
}