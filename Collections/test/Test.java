package test;

/**
 * 
 * Java program to demonstrate how to sort Map in Java on key and values. Map
 * can be sort on keys or values.
 * 
 * @author Javin Paul
 */
public class Test {

	public static void main(String args[]) {
		
	MyThread m = new MyThread();
	m.start();
	m.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
		
		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("Thread --"+t+" Excep--"+e.getMessage());
			
		}
	});
		
		
		
		

	}

	public static String trimString(String ss) {
		String s = ss;
		System.out.println("##" + s + "##");

		while (s.startsWith(" ")) {
			s = s.substring(1);

		}

		System.out.println("##" + s + "##");

		while (s.endsWith(" ")) {
			s = (String) s.subSequence(0, s.length() - 1);
		}

		System.out.println("##" + s + "##");
		return s;
	}
}
