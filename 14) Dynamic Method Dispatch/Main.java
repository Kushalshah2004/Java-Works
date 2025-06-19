class Main{
	public static void main(String args[]){
		/*A ob1 = new A();	//Valid 
		B ob2 = new B();	//Valid
		ob1.a();
		ob1.call();
		ob2.b();
		ob2.call();*/
		A ob = new B();
		ob.a();
		ob.call();
	}
}