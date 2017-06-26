package custom.semaphore;

public class Semaphore {
	
	private int signals = 0;
	private int count = 0;

	public Semaphore(int count) {
		this.count = count;
	}

	public synchronized void acquire() throws InterruptedException {
		while (this.signals == count) {
			wait();
		}
		this.signals++;
		this.notify();
	}

	public synchronized void release() throws InterruptedException {
		while (this.signals == 0) {
			wait();
		}
		this.signals--;
		this.notify();
	}
}
