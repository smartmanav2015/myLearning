import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		
		map.put("a", "b");
		
		System.out.println(map.get("a"));

	}

}
