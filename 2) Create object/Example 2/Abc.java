class Abc{
	int a,b;
	int setdata(int a,int b){
		System.out.println("Setdata is called");
		System.out.println("");
		this.a = a;
		this.b = b; 	
		return 0;
	}

	int showdata(){
		System.out.println("Showdata is called");		
		System.out.println("");
		System.out.println("Value of a="+this.a);
		System.out.println("Value of b="+this.b);
		return 0;
	}
}