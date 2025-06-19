class MyThread implements Runnable
{	
	int no;
	MyThread(int no)
	{
		this.no = no;
	}	
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Thread no" + no + ":" + i);
		}
	}
}