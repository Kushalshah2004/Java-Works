class Mythread extends Thread
{
	int num;
	Mythread(int num)	
	{
		this.num = num;
		System.out.println("Thread Created");
		this.start();
	}
	public void run()
	{
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		for(byte i=1;i<=50;i++)
		{
			if(i % num == 0)
			{
				System.out.println(i);
			}
		}
	}
}