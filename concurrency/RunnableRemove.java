

public class RunnableRemove implements Runnable {

	@Override
	public void run() {
		ConcMapTest c = ConcMapTest.getInstance();
		//Set s = c.map.keySet();
		
		for(int i=0;i<90;i++){
			c.map.remove("key"+i);
			
		}
		
		System.out.println("REM "+c.map.size());
		
		

	}

}
