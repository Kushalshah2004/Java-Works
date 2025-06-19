class Main
{
	public static void main(String args[])
	{
		Mythread t1 = new Mythread(1);
		Mythread t2 = new Mythread(2);
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{	System.out.println("Exception Occure");
			
		}
	}
}