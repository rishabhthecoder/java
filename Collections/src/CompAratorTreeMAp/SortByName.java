package CompAratorTreeMAp;
import java.util.*;
public class SortByName implements Comparator<Stock> {
	public int compare(Stock s1,Stock s2) {
		return s2.getName().compareTo(s1.getName());
	}

}
