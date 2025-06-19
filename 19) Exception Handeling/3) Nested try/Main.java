class Main
{
	public static void main(String args[])
	{	
		try
		{
			int arr[] = {0,1,2,3,4,5};
			try
			{
				int x = arr[1]/arr[0];
				System.out.println("Ans:" + x);
			}
			catch(ArithmeticException e)
			{

				System.out.println("ArithmeticException");
				System.out.println("System Message: " + e.getMessage());
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("System Message: " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			System.out.println("System Message: " + e.getMessage());
		}	
	}
}