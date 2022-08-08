package CompArator;

import java.util.Comparator;

public class IdComaprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.roll,o1.roll);
	}

}
