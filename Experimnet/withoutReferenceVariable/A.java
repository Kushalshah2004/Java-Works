class A{
	int x,y;

	A setdata(int x,int y){
		this.x = x;
		this.y = y;
		return this;
	}
	void showdata(){
		System.out.println("Value of X:" + x);
		System.out.println("Value of y:" + y);
	}
}