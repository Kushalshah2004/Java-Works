class Main extends Try{

	private void sum(int a, int b)
	{
		System.out.println("From Protected :");
	}
	@Override
	public void sum(int a)
	{
		System.out.println("From Public");
	}
}