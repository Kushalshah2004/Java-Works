class Pqr extends Abc{
	int p,q;
	void setdata(int a,int b,int p,int q){
		setdata(a,b);
		this.p = p;
		this.q = q;
	}
	void showdata(){
		super.showdata();
		System.out.println("Value of p:" + p + "\n" + "Value of q:" + q);
	}
}