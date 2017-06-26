import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcMapTest {
	public final Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();

	private final static int MAP_SIZE = 100;

	private static final ConcMapTest c = new ConcMapTest();

	public static void main(String[] args) {
		ConcMapTest c = new ConcMapTest();
		// c.iterateMap();
	}

	private ConcMapTest() {
		for (int i = 0; i < MAP_SIZE; i++) {
			map.put("key" + i, i);
		}
		System.out.println(map.keySet());
	}

	/*
	 * public void iterateMap(){
	 * 
	 * Set s = map.keySet();
	 * 
	 * Iterator<String> itr = s.iterator(); while(itr.hasNext()){
	 * 
	 * System.out.println(itr.next()); map.remove("key3");
	 * 
	 * }
	 */

	public static ConcMapTest getInstance() {
		return c;
	}

}
