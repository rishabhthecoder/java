package CompAratorTreeMAp;

import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String arg[]) {
		TreeMap<Stock, Integer> tm1 = new TreeMap<>(new sortByPrice());
		tm1.put(new Stock(1, "K-pan", (float) 80.5, 13), 1);
		tm1.put(new Stock(1, "Kedaxime", (float) 90.5, 11), 2);
		tm1.put(new Stock(1, "ambrocuff", (float) 50.75, 12), 3);
		tm1.put(new Stock(1, "K-pan dsr", (float) 100.5, 14), 4);
		tm1.put(new Stock(1, "Kedirab", (float) 120.5, 15), 5);

		System.out.println(tm1);

		TreeMap<Stock, Integer> tm2 = new TreeMap<>(new SortByName());
		tm2.putAll(tm1);
		// for (int i=0;i<tm2.size();i++) {
		// for(int j=0;tm2.et(getSno()))
		// System.out.println(tm2.firstEntry());
		// }
		
		System.out.println("Traversing a map");
	for(Entry<Stock, Integer> en:tm2.entrySet())
		System.out.println(en.getKey()+" :"+en.getValue());
		//System.out.println(tm2.firstKey());
	}

}
