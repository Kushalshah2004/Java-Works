class Employee{
	private int id;
	private String name;
	private int age;
	private int salary;
	void getid(int id){
		this.id = id;
	}
	void getname(String name){
		this.name = name;
	}
	void getage(int age){
		this.age = age;
	}
	void getsalary(int salary){
		this.salary = salary;
	}
	int setid(){
		return this.id;
	}
	String setname(){
		return this.name;
	}
	int setage(){
		return this.age;
	}
	int setsalary(){
		return this.salary;
	}
}