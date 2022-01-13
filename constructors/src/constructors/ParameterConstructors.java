package constructors;

public class ParameterConstructors {

	int modelYear;
	String modelName;

	public ParameterConstructors(int year, String name) {
		System.out.println("parameterized constructor called");
		modelYear = year;
		modelName = name;
	}

	public ParameterConstructors() {
		System.out.println("Non parameterized constructor called");
		modelYear = 2000;
		modelName = "Maruti";
	}

	public static void main(String[] args) {
		ParameterConstructors myCar = new ParameterConstructors(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
		ParameterConstructors myCar2 = new ParameterConstructors();
		System.out.println(myCar2.modelYear + " " + myCar2.modelName);
	}
}
