class MyThread extends Thread
{
	String s = null;
	int no;
	MyThread(String s,int no)
	{
		super(this);
		this.s = s;
		this.no = no;
		start();
	}
	public void run()
	{
		System.out.println(s + no);
	}
	
}