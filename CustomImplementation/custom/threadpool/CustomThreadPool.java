package custom.threadpool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomThreadPool {
	
	private final LinkedList<Runnable> taskQueue;
	private final List<WorkerThread> pool;

	public CustomThreadPool(int noOfThreads) {
		
		this.taskQueue = new LinkedList<Runnable>();
		this.pool = new ArrayList<WorkerThread>();
		
		for (int i = 0; i < noOfThreads; i++) {
			WorkerThread thread = new WorkerThread(taskQueue);
			pool.add(thread);
			thread.start();
		}
	}

	public void stop() {
		
		for (int i = 0; i < pool.size(); i++) {
			pool.get(i).shouldStop();
		}
	}

	public void execute(Runnable task) {
		
		synchronized (taskQueue) {
			this.taskQueue.addLast(task);
			taskQueue.notify();
		}
	}
}
