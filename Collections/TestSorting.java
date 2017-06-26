import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;



public class TestSorting {

	public static void main(String[] args) {
		
		Salary s1 = new Salary(1L);
		Salary s2 = new Salary(2L);
		Salary s3 = new Salary(3L);
		
		REmployee e1 = new REmployee(s1, "aakash1");
		REmployee e2 = new REmployee(s2, "aakash2");
		REmployee e3 = new REmployee(s3, "aakash3");

		List<REmployee> list = new ArrayList<REmployee>();
		list.add(e3);
		list.add(e2);
		list.add(e1);

		TreeMap<REmployee, String> map = new TreeMap<REmployee, String>();
		map.put(e3, "c");
		map.put(e2, "b");
		map.put(e1,"a");
		System.out.println(map.toString());

		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}

}
