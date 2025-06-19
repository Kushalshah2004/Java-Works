class A
{
	int arr[]={1,2,3,4};
	void perform()
	{	
		try
		{
			arr[5] = 6 /1;
			System.out.println("Ans:" + arr[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("System Message: " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("System Message: " + e.getMessage());
		}
	}
	
}