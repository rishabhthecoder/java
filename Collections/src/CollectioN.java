
import java.util.*;
public class CollectioN {
	public static void main(String arg[]) {
		ArrayList<Integer> al1=new ArrayList<>();
		List<Integer> al2=new ArrayList<>();
		al1.add(2);
		al1.add(6);
		al1.add(4);
		al1.add(7);
		al1.add(1);
		al2.add(1);
		al2.add(3);
		al2.add(5);
		System.out.println("al1:- "+al1);
		System.out.println("al2:- "+al2);
		Collections.sort(al1);
		Collections.sort(al2,Collections.reverseOrder());
		System.out.println("al2 in reverse order:- "+al2);
		System.out.println("al1 after sorting:- "+al1);
		System.out.println("Searching element ie position of \"2\" is:-  "+Collections.binarySearch(al1, 2));
		//if Element not present then result is minus of position where element should be their -1 ie 10 should be their at 5 so -5-1=-6
		System.out.println("Searching element ie position of \"10\" is:-  "+Collections.binarySearch(al1, 10));
		System.out.println("Disjoint Collections:-"+Collections.disjoint(al1, al2));
		Collections.copy(al1, al2);
		System.out.println("Copy() function of collections class :-"+al1);
		
	}

}
