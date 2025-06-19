class Mythread extends Thread
{
	int num;
	Mythread(int num)
	{
		this.num = num;
		this.start();
		System.out.println("Thread Created");
	}
	public void run()
	{
		for(byte i=0;i<25;i++)
		{
			System.out.println(num);
			num = num + 2;
		}
	}
}