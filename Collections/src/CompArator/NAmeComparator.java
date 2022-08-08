package CompArator;

import java.util.Comparator;

public class NAmeComparator implements Comparator<Student>
{


@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.name.compareTo(o2.name);
//	return Character.compare(o1.name.charAt(0),o2.name.charAt(0));
}
}