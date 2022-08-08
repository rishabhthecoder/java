package CompArator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String arg[]) {
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(new Student(2, "Rishabh", 24));
		al1.add(new Student(1, "Raghav", 19));
		al1.add(new Student(3, "Reena", 34));
		System.out.println("unsorted");
		System.out.println(al1);
		// or
		System.out.println("Printing using for each");
		for (Student s1 : al1)
			System.out.println(s1);
		// or
		System.out.println("printing using get method of collections class");
		for (int i = 0; i < al1.size(); i++)
			System.out.println(al1.toString());

		System.out.println("Sorting by name");
		Collections.sort(al1, new NAmeComparator());
		System.out.println(al1);

		System.out.println("Sorting by age");
		Collections.sort(al1, new AgeComparator());
		System.out.println(al1);

		System.out.println("Sorting by id descending order");
		Collections.sort(al1, new IdComaprator());
		System.out.println(al1);

		System.out.println("using Comparable interface");
		Collections.sort(al1);
		System.out.println(al1);

	}

}
