import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Abc ob1, ob2, ob3;
		int a, b;
		Scanner sc = new Scanner(System.in);
		ob1 = new Abc();
		ob2 = new Abc();
		ob3 = ob1.addAbc(ob2);
		System.out.print("Enter value for object 1.a:");
		a = sc.nextInt();
		System.out.print("Enter value for object 1.b:");
		b = sc.nextInt();
		ob1.setdata(a, b);
		System.out.print("Enter value for object 2.a:");
		a = sc.nextInt();
		System.out.print("Enter value for object 2.b:");
		b = sc.nextInt();
		ob2.setdata(a, b);
		System.out.println("Object A");
		ob1.showdata();
		System.out.println("Object B");
		ob2.showdata();
		System.out.println("Addition of object");
		ob3.showdata();
	}
}