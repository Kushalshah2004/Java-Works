import java.util.Scanner;
class Main{
	public static void main(String ags[]){
		int a,b,p,q;
		System.out.print("Enter Value of A:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.print("Enter Value of B:");
		b = sc.nextInt();
		System.out.print("Enter Value of P:");
		p = sc.nextInt();
		System.out.print("Enter Value of Q:");
		q = sc.nextInt();
		Pqr ob1 = new Pqr(a,b);
		Pqr ob2 = new Pqr(a,b,p,q);
		System.out.println("Object 1");
		ob1.showdata();
		System.out.println("Object 2");
		ob2.showdata();
	}
}