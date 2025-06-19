//import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		if(args.length!=0)
		{
			for(byte i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}
		else 
		{	
			System.out.println("No input Found");
		}
	}
}