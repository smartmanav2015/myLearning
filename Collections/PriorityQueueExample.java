import java.util.Iterator;
import java.util.PriorityQueue;


/**
 * @author asax22
 * 
 1) unbounded priority queue based on a priority heap.
 2) ordered according to their natural ordering, or by a Comparator provided
3) not permit null elements.
4) insrt element with comparable
 *
 */
public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.add("jakash");
		q.add("aakash");
		q.add("Prakash");
		
		for(String s : q){
			System.out.println(s);
		}
		
	PriorityQueue<Employees> list = new PriorityQueue<Employees>();
		
		list.add(new Employees("aakash"));
		list.add(new Employees("saxena"));
		
		
		for(Employees s : list){
			System.out.println(s.toString());
		}
		
		
	}

}
