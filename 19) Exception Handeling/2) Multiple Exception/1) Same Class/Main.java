class Main
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4};
		try
		{	
			//arr[5] = 6/1;	// 0 become 1 (error get)
			arr[3] = 6/2;
			System.out.println("Ans:" + arr[3]);	// if there is more then 3 (error get)
		}
		catch(ArithmeticException e)// if 0 is constant then call this
		{
			System.out.println("System Message:" + e.getMessage());
		}
		catch(Exception e)// if 0 become 1 call this
		{
			System.out.println("System Message:" + e.getMessage());
		}
	}
}