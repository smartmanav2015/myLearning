package custom.countdownLatch;


public class CountDownLatch {
	
	private int count = 0;
	

	public CountDownLatch(int count) {
		this.count = count;
	}

	public synchronized void await() throws InterruptedException {
		while (this.count > 0) {
			wait();
		}
	}

	public synchronized void countdown() throws InterruptedException {
		
		if(!(count == 0) ){
			
			this.count--;
			
			if(count == 0){
				this.notifyAll();
			}
		}
		
	}
}

