public class Test {

	public static void main(String[] args) throws InterruptedException {

		RunnableAdd add = new RunnableAdd();

		RunnableRemove rem = new RunnableRemove();

		Thread t1 = new Thread(add);
		Thread t2 = new Thread(rem);

		System.out.println("BEFORE "+ConcMapTest.getInstance().map.size());

		t2.start();
		t1.start();
		
		Thread.sleep(4000);

		System.out.println("BEFORE "+ConcMapTest.getInstance().map.size());

	}
}
