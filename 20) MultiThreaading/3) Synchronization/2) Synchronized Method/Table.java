class Table
{
	synchronized void printTable(float no)
	{
		for(byte i=1;i<=10;i++)
		{
			float ans = no * i;
			System.out.println(no + " * " + i + " = " + ans);
		}
	}
}