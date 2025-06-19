class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("You can't vote");
	}
	public String getMessage()
	{
		return ("This is user defined exception");
	}
}