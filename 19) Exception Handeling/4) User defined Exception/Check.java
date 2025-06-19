class Check
{
	void check(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException();
		}
		else
		{
			System.out.println("Yes,you can vote");
			System.out.println("No,exception occure");
		}
	}
	
}