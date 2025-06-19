class A
{
	int a,b;
	void setdata(int a,int b)
	{
		this.a = a;
		this.b = b;
		this.showdata();
	}	
	void showdata()
	{
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