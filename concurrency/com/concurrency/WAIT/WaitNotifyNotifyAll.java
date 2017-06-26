package com.concurrency.WAIT;

import java.util.Queue;

import java.util.LinkedList;

public class WaitNotifyNotifyAll {

	private Queue<Object> buf = new LinkedList<Object>();
	
	public int MAX_SIZE;

	public synchronized void put(Object o) throws InterruptedException {
		
		while (buf.size() == MAX_SIZE) {
			wait(); // called if the buffer is full (try/catch removed for brevity)
		}
		buf.add(o);
		notify(); // called in case there are any getters or putters waiting
	}

	public synchronized Object get() throws InterruptedException {
		// Y: this is where C2 tries to acquire the lock (i.e. at the beginning of the method)
		while (buf.size() == 0) {
			wait(); // called if the buffer is empty (try/catch removed for brevity)
			// X: this is where C1 tries to re-acquire the lock (see below)
		}
		Object o = buf.remove(0);
		notify(); // called if there are any getters or putters waiting
		return o;
	}
	
	
/*	Ok, now why do we need notifyAll?
 * 
 * STEP 1:
		- P1 puts 1 char into the buffer

		STEP 2:
		- P2 attempts put - checks wait loop - already a char - waits

		STEP 3:
		- P3 attempts put - checks wait loop - already a char - waits
		
		P2 - P3 waiting

		STEP 4:
		- C1 attempts to get 1 char
		- C2 attempts to get 1 char - blocks on entry to the get method
		- C3 attempts to get 1 char - blocks on entry to the get method

		STEP 5:
		- C1 is executing the get method - gets the char, calls notify, exits method
		- The notify wakes up P2
		- BUT, C2 enters method before P2 can (P2 must reacquire the lock), so P2 blocks on entry to the put method
		- C2 checks wait loop, no more chars in buffer, so waits
		- C3 enters method after C2, but before P2, checks wait loop, no more chars in buffer, so waits
		
		C2 - C3waits

		STEP 6:
		- NOW: there is P3, C2, and C3 waiting!
		- Finally P2 acquires the lock, puts a char in the buffer, calls notify, exits method

		STEP 7:
		- P2's notification wakes P3 (remember any thread can be woken)
		- P3 checks the wait loop condition, there is already a char in the buffer, so waits.
		- NO MORE THREADS TO CALL NOTIFY and THREE THREADS PERMANENTLY SUSPENDED!

		SOLUTION: Replace notify with notifyAll in the producer/consumer code (above).*/
	
	
	/*
	 * Why do we need a while loop surrounding the wait?
	 * 
	 * We need a while loop in case we get this situation:
	 * 
	 * Consumer 1 (C1) enter the synchronized block and the buffer is empty, so
	 * C1 is put in the wait set (via the wait call). Consumer 2 (C2) is about
	 * to enter the synchronized method (at point Y above), but Producer P1 puts
	 * an object in the buffer, and subsequently calls notify. The only waiting
	 * thread is C1, so it is woken and now attempts to re-acquire the object
	 * lock at point X (above).
	 * 
	 * Now C1 and C2 are attempting to acquire the synchronization lock. One of
	 * them (nondeterministically) is chosen and enters the method, the other is
	 * blocked (not waiting - but blocked, trying to acquire the lock on the
	 * method). Let's say C2 gets the lock first. C1 is still blocking (trying
	 * to acquire the lock at X). C2 completes the method and releases the lock.
	 * Now, C1 acquires the lock. Guess what, lucky we have a while loop,
	 * because, C1 performs the loop check (guard) and is prevented from
	 * removing a non-existent element from the buffer (C2 already got it!). If
	 * we didn't have a while, we would get an IndexArrayOutOfBoundsException as
	 * C1 tries to remove the first element from the buffer!
	 */
}