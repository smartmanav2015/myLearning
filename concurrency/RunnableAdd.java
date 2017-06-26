import java.util.Set;


public class RunnableAdd implements Runnable {

	@Override
	public void run() {
		ConcMapTest c = ConcMapTest.getInstance();
		//Set s = c.map.keySet();
		
		for(int i=0;i<100;i++){
			c.map.put("keyADD "+i, i);
			
		}
		
		System.out.println("ADD "+c.map.size());
		
		

	}

}
