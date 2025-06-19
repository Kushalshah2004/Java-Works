class Main
{
	public static void main(String args[])
	{
		int a;

		a = 0;
		MyThread mt0 = new MyThread(a);
		Thread t0 = new Thread(mt0);

		a = 1;
		MyThread mt1 = new MyThread(a);
		Thread t1 = new Thread(mt1);

		a = 2;
		MyThread mt2 = new MyThread(a);
		Thread t2 = new Thread(mt2);

		a = 3;
		MyThread mt3 = new MyThread(a);
		Thread t3 = new Thread(mt3);

		t0.start();

		t1.start();

		t2.start();

		t3.start();
	}
}