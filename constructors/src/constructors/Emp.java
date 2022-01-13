package constructors;

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
		System.out.println("constructor called");
		this.display();
		super.display();
		System.out.println("constructor end");

	}

	void display() {
		System.out.println("display() of emp class");
		System.out.println(id + " " + name + " " + salary);
	}
}
