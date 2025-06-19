class Main{
	public static void main(String args[]){
		if(args.length>0){
			int i;
			for(i=0;i<args.length;i++){
				System.out.println("The Args[" + i +"]:" + args[i]);
			}
		}
		else{
			System.out.print("No args is given");
		}
	}
}