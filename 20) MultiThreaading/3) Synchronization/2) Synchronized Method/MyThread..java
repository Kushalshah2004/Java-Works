class MyThread extends Thread
{
	float no;
	Table tab;
	MyThread(float no,Table tab)
	{
		this.no = no;
		this.tab = tab;
		this.start();
	}
	public void run()
	{
		tab.printTable(no);
	}
}