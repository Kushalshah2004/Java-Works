class Main
{
	public static void main(String args[])
	{
		B ob = new B();
		System.out.println("ob Value of a = " + (ob.a + 10));
		B ob1 = new B();
		System.out.println("ob1 Value of a = " + ob1.a);
		ob.a();
		ob.b();
	}
}