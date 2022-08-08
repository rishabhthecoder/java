package CompAratorTreeMAp;

import java.util.Comparator;

public class sortByPrice implements Comparator<Stock> {
	public int compare (Stock s1,Stock s2) {
		return (int)(s1.getPrice()-s2.getPrice());
	}

}
