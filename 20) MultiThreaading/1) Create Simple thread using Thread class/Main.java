class Main
{
	public static void main(String args[])
	{
		MyThread thread = new MyThread("Thread Start",1);
		//Thread t1 = new Thread(thread);
		MyThread thread1 = new MyThread("Thread Start",2);
		//Thread t2 = new Thread(thread1);
		MyThread thread2 = new MyThread("Thread Start",3);
		//Thread t3 = new Thread(thread2);
		MyThread thread3 = new MyThread("Thread Start",4);
		//Thread t4 = new Thread(thread3);
	}
}