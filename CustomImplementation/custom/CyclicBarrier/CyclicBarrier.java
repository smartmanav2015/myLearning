package custom.CyclicBarrier;

public class CyclicBarrier {

	private int count = 0;

	public CyclicBarrier(int count) {
		this.count = count;
	}

	public synchronized void await() throws InterruptedException {

		if (count > 0) {

			while (count > 0) {
				count--;
				if (count == 0) {
					notifyAll();					
				} else {
					wait();
				}
			}
		} else {
			throw new RuntimeException("Count is already ZERO so Await can't be called by more threads");
		}
	}

}
