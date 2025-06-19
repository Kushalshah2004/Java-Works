import java.io.File;
class Main
{
	public static void main(String args[])
	{
		boolean b;
		try
		{
			File  f = new File("F://First.txt");
			b = f.createNewFile();
			System.out.println("File created:" + b);
			f.delete();
			System.out.println("Delete Method invoke");
			b = f.createNewFile();
			System.out.println("File created:" + b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}