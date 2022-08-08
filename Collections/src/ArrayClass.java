import java.util.Arrays;
import java.util.List;

public class ArrayClass {
	public static void main(String arg[])
	{
		int a1[]= {2,4,6,3,1,5};
		int a2[]= {6,8,7,9,5};
		int a3[]=Arrays.copyOf(a2, 10);
		System.out.println("copying an array:- "+Arrays.toString(a3));
		a3=Arrays.copyOfRange(a2, 1,3);
		System.out.println("copying an array:- "+Arrays.toString(a3));
		
		Arrays.sort(a2);
		System.out.println("sorting of array:- "+Arrays.toString(a2));
		System.out.println("binary search on \"8\":- "+Arrays.binarySearch(a2, 8));
		System.out.println("Array as a list "+Arrays.asList(a1));
	}
//	public String toString(List<Integer> a) {
//		System.out.println(a);
//		return a+" ";
//		
//	}
}
