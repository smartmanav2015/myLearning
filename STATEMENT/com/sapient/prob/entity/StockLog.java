package com.sapient.prob.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.sapient.prob.util.ConcurrentLRUCache;
import com.sapient.prob.util.PriceUtil;

public class StockLog {
	
	private BigDecimal currentPrice;
	
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock(); 
	Lock readLock = lock.readLock();
	Lock writeLock = lock.writeLock();
	
	private final ConcurrentLRUCache<Date, Log> cache = new ConcurrentLRUCache<Date, Log>(2);

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public ConcurrentLRUCache<Date, Log> getCache() {
		return cache;
	}

	public void addtoCache(Date date, Log log){
		try{
		writeLock.lock();
		cache.put(date, log);
		}finally{
			writeLock.unlock();
		}
	}
	
	public void getFromCache(Date date){
		try{
		readLock.lock();
		TreeSet<Date> set = new TreeSet<Date>();
		set.addAll(cache.getKeys());
		cache.get(set.floor(date));
		}finally{
			writeLock.unlock();
		}
	}
	
	public BigDecimal calculateAveragePrice(){
		// Calculate average price
		BigDecimal avgPrice = PriceUtil.getPriceAverage(cache.getValues());
		return avgPrice;
	}
	

}
