class Abc{
	int a,b;
	Abc(){
		System.out.println("Abc() Called");
		this.a = 0;
		this.b = 0;
	}
	Abc(int a,int b){
		System.out.println("Abc(int a,int b) Called");
		this.a = a;
		this.b = b;
	}
	void setdata(int a,int b){
		this.a = a;
		this.b = b;
	}
	void showdata(){
		System.out.println("Value of A:" + a + "\n" + "Value of B:" + b);
	}
}