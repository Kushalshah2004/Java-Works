class Main{
	static{
		System.out.print("I am from Static block\n");
	}
	public static void main(String args[]){
		Staticmember ob = null; // Get Error null poinetr Exception
		//Staticmember ob;
		System.out.println("Before accessing A\n");
		//ob.s = 100;
		ob.m1();
		System.out.println("After accessing A");
		System.out.println("s:" + ob.s);
	}
}