class Main{
	public static void main(String args[]){
		Abc ob = new Abc();
		System.out.println("Value of static A for object ob:" + ob.a);
		ob.a +=100;
		System.out.println("After adding 100 in ob.a");
		System.out.println("Value of static A for object ob:" + ob.a);
		System.out.println();
		System.out.println("Value of B for object ob:" + ob.b);
		ob.b +=10;
		System.out.println("After adding 10 in ob.b");
		System.out.println("Value of B for object ob:" + ob.b);
		System.out.println();
		Abc ob1 = new Abc();
		System.out.println("Value of static A for object ob1:" + ob1.a);
		System.out.println("Value of B for object ob1:" + ob1.b);
	}
}