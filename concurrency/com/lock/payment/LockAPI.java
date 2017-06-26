package com.lock.payment;


public class LockAPI {

	public boolean transferMoneyWithTryLock(Account fromAccount,Account toAccount, float amount) throws InsufficientAmountException{//, InterruptedException {

		// we are defining a stopTime
		long stopTime = System.nanoTime() + 5000;
		
		while (true) {
			if (fromAccount.lock.tryLock()) {
				try {
					if (toAccount.lock.tryLock()) {
						try {
							if (amount > fromAccount.getCurrentAmount()) {
								throw new InsufficientAmountException("Insufficient Balance");
							} else {
								fromAccount.debit(amount);
								toAccount.credit(amount);
							}
						} finally {
							toAccount.lock.unlock();
						}
					}

				} finally {
					fromAccount.lock.unlock();
				}
			}
			if (System.nanoTime() < stopTime)
				return false;

			//Thread.sleep(100);
		}// while
	}
}
