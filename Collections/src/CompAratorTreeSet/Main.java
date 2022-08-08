package CompAratorTreeSet;
import java.util.*;
public class Main {

	public static void main(String arg[]) {
		TreeSet <String> ts1=new TreeSet<>();
		ts1.add("This");
		ts1.add("is");
		ts1.add("rishabh");
		ts1.add("this");
		ts1.add("side");
		System.out.println("orignal set implementations");
		System.out.println(ts1);
		
		TreeSet<String> ts2=new TreeSet<>(new StringSort());
		ts2.addAll(ts1);
		
		System.out.println("Tree set after using String Sort\n"+ts2);
		
		
	}
}
