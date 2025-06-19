import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		StringBuffer strb = new StringBuffer();
		String str = new String();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name:");
		str = sc.nextLine();

		strb.append(str);

		System.out.print("Name:" + strb);		
	}
}