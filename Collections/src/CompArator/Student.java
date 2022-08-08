package CompArator;

public class Student implements Comparable<Student> {
int roll;
String name;
int age;

public Student(int roll, String name, int age) {
	//super();
	this.roll = roll;
	this.name = name;
	this.age = age;
}
public String toString() {
	return roll+" "+name+" "+age;
	
	
}

@Override
public int compareTo(Student arg0) {
	// TODO Auto-generated method stub
	return Integer.compare(this.roll, arg0.roll);
}
}
