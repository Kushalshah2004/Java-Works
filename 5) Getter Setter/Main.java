import java.util.Scanner;
class Main{
	public static void main(String args[]){
		int id,age,salary;
		String name;

		Scanner sc = new Scanner(System.in);
		/*Scanner sc1 = new Scanner(System.in);*/
		System.out.print("Enter ID:");
		id = sc.nextInt();
		/*System.out.print("Enter Name:");
		name = sc1.nextLine();*/

		System.out.print("Enter Name:");
		name = sc.nextLine();

		System.out.print("Enter age:");
		age = sc.nextInt();
		
		System.out.print("Enter Salary:");
		salary = sc.nextInt();

		Employee ob = new Employee();

		ob.getid(id);
		ob.getname("Kushal");
		ob.getage(age);
		ob.getsalary(salary);

		System.out.println("ID:" + ob.setid());		
		System.out.println("Name:" + ob.setname());
		System.out.println("Age:" + ob.setage());
		System.out.println("Salary:" + ob.setsalary());
	}
}