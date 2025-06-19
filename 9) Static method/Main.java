class Main
{
	public static void main(String args[])
	{
		Abc ob = new Abc();
		ob.setdata(100);
		System.out.println("Value of static A for object ob:" + ob.a);
		Abc.display();
	}
}