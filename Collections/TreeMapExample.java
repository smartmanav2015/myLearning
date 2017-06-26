import java.util.TreeMap;

import com.Map.Map;


public class TreeMapExample {

	public static void main(String[] args) {
		
		java.util.Map<String, String> map = new TreeMap<String, String>();

		map.put("zz", "aa");
		map.put("xx", "cc");
		map.put("yy", "bb");
		
		System.out.println(map.entrySet());
		
		java.util.Map<Employees, String> m = new TreeMap<Employees, String>();

		m.put(new Employees("aakash"), "aa");
		
		
		System.out.println(map.values());
	}

}
