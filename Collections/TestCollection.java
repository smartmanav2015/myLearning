import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;


public class TestCollection {
	
	public static void main (String [] args){
		
		/*HashMap<String, String> map = new  HashMap<String, String>();
		
		//map.put(null, "daboo");
		map.put("a", "saxena");
		map.put("b", "aakash");
		map.put("c", "papa");
		//map.put(null, "daboo");
		
		Map<String, String> maps =  (HashMap<String, String>) Collections.unmodifiableMap(map);
		
		maps.put("s", "ss");
		*/
		
		HashSet<String> strSet = new HashSet<String>();
		
		strSet.add("aakash");
		strSet.add("saxena");
		strSet.add("aakash");
		System.out.println(strSet.size());
		
		
		
		HashSet<Game> set = new HashSet<Game>();
		
		Game game = new Game(1L, "nfs3","EASports");
		
		Game game1 = new Game(1L, "nfs4","EASports");
		
		Game game2 = new Game(1L, "nfs3","EASports");
		
		set.add(game);
		set.add(game1);
		set.add(game2);
		System.out.println(set.size());
		
		TreeSet<Game> s = new TreeSet<Game>();
		s.add(game);
		s.add(game1);
		s.add(game2);
		System.out.println(s.size());
		
	}

}
