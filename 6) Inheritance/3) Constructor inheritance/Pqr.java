class Pqr extends Abc{
	int p,q;
	Pqr(int a,int b){
		super(a,b);
		System.out.println("Pqr(int,int)");
	}
	Pqr(int a,int b,int p,int q){
		super(a,b);
		this.p = p;
		this.q = q;
		System.out.println("Pqr(int,int,int,int)");
	}
	Pqr(){
		System.out.print("Pqr()");	
	}
	void setdata(int a,int b,int p,int q){
		setdata(a,b);
		this.p = p;
		this.q = q;
	}
	void showdata(){
		super.showdata();
		System.out.println("Value of P:" + p + "\n" + "Value of Q:" + q);
	}
}