import java.util.Scanner;
class Abc{
	int a,b;
	Abc(){
		System.out.println("Enter value of a:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter value of b:");
		b = sc.nextInt();
		sc.close();
	}
	void showdata(){
		System.out.println("Value of a:" + a);
		System.out.println("Value of b:" + b);	
	}
}