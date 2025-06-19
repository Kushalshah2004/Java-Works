class Main
{
	public static void main(String args[])
	{
		Abc ab = new Abc();
		ab.showdata();

		Class cob = ab.getClass();
		System.out.println("Class object for ab:" + cob);

		Class cob1 = cob.getClass();
		System.out.println("Class object for cob:" + cob1);

		Object ob = new Object();
		cob = ob.getClass();
		System.out.println("Class object for ob:" + cob);
	
	}
}