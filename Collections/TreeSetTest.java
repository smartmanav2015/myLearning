import java.util.TreeSet;

public class TreeSetTest {
	
	
	public static void main (String args []){
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("bb");
		ts.add("cc");
		ts.add("aa");
		
		for(String s : ts){
			System.out.println(s);
		}
		

		TreeSet<Employees> t = new TreeSet<Employees>();
		
		t.add(new Employees("bb"));
		t.add(new Employees("aa"));
	
		
		for(Employees s : t){
			System.out.println(s.toString());
		}
		

		
		
	}
	

}
