class Abc{
	int a,b;
	void setdata(int a,int b){
		System.out.println("Data copy from main");
		System.out.println("");
		this.a = a;
		this.b = b;
	}
	void showdata(){
		System.out.println("Value of a:" + a);
		System.out.println("Value of b:" + b);
	}
	Abc addAbc(Abc ob2){
		Abc ob1 = new Abc();
		ob1.a = this.a + ob2.a;
		ob1.b = this.b + ob2.b;
		return ob1;
	}
}