import java.util.*;
class Main
{
	public static void main(String args[])
	{
		String str[] = new String[3];
		int i,min,count;
		String match[];
		int string_len_min[] = new int[3];
		
		System.out.println("Maximum size of String is 3");
		Scanner sc = new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			System.out.print("Enter String for no" + (i+1) + " :");
			str[i] = sc.nextLine();
		}
		for(i=0;i<3;i++)
		{
			string_len_min[i] = str[i].length;
		}
		if(string_len_min[0] > string_len_min[1])
		{
			if(string_len_min[1] > string_len_min[2])
			{
				min = string_len_min[2];
			}
			else
			{
				min = string_len_min[1];
			}
		}
		else
		{
			if(string_len_min[0] < string_len_min[2])
			{
				min = string_len_min[0];
			}
			else
			{
				min = string_len_min[2];
			}
		}
		for(i=0;i<min;i++)
		{
			if(str[0].charAt(i) == str[1].charAt(i))
			{
				if(str[0].charAt(i) == str[2].charAt(i))
				{
					match.charAt[i] = str[0].charAt(i);
					count++;
				}
			}
			else
			{
				System.out.println("No match found");
				break;
			}
		}
		if(count > 0)
		{
			for(i=0;i<min;i++)
			{
				System.out.print(match[i]);
			}
		}
	}
}