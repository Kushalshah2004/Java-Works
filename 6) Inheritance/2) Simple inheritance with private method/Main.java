import java.util.Scanner;
class Main{
	public static void main(String args[]){
		int a,b,p,q;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of A:");
		a = sc.nextInt();
		System.out.print("Enter Value of B:");
		b = sc.nextInt();
		System.out.print("Enter Value of P:");
		p = sc.nextInt();
		System.out.print("Enter Value of Q:");
		q = sc.nextInt();
		Pqr ob1 = new Pqr();
		Pqr ob2 = new Pqr();
		System.out.println("Object 1");
		ob1.setdata(10,20);
		ob1.showdata();
		System.out.println("Object 2");
		ob2.setdata(a,b,p,q);
		ob2.showdata();
	}	
}