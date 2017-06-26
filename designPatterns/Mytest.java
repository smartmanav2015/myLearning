import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Mytest {
	
	private int age = 25;
	
	private int height ;
	
	public Mytest(){
		height = 23;
		age = 46;
	}

	public static void main(String[] args) {

		Mytest t = new Mytest();
		System.out.println(t.getAge());
		System.out.println(t.getHeight());
		
		
		
		Date d = new Date();
		System.out.println(d);
		Long time = d.getTime();
		System.out.println(time);
		System.out.println(time/60000);
		
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 2);
		Date now = cal.getTime();
		System.out.println(now+" ##");
		
		ScheduledExecutorService e = Executors.newScheduledThreadPool(5);
		
		demo.addElement();
		
		

	}

	public void a() throws IOException {/*
										 * 
										 * throw new IOException(); //b();
										 * //System.out.println("saxena");
										 */
	}

	public void b() {/*
					 * 
					 * try{ int i = 5/0; }catch(Exception e){
					 * System.out.println("aakash"); e.printStackTrace(); throw
					 * new RuntimeException();
					 * 
					 * }
					 */
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
