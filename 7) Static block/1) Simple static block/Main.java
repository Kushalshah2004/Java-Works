class Main{
	static{
		System.out.println("I am from static block");
	}
	public static void main(String args[]){
		Abc ob = new Abc();
		ob.main();
		System.out.println("I am from Main block");
	}
}