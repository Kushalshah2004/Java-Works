class Main
{
	public static void main(String args[])
	{
		int a=10,b=0;
		try
		{	
			System.out.println(a + " + " + b + ":" + (a+b));
			System.out.println(a + " - " + b + ":" + (a-b));
			System.out.println(a + " * " + b + ":" + (a*b));
			System.out.println(a + " / " + b + ":" + (a/b));
			System.out.println(a + " % " + b + ":" + (a%b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("System Message: " + e.getMessage());
		}
	}
}