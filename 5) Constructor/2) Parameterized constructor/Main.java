import java.util.Scanner;
class Main{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value 1:");
		a = sc.nextInt();
		System.out.print("Enter value 2:");
		b = sc.nextInt();
		Abc ob = new Abc(a,b);
	}
}