package com.sapient.prob.batch;

import java.net.URI;
import java.util.concurrent.ConcurrentHashMap;

import com.sapient.prob.entity.StockLog;

public class RunnableJob implements Runnable {
	
	private URI uri;
	private String sourceName = "SOURCE1";
	private volatile boolean stop = false;
	private ConcurrentHashMap<String, StockLog> stocksMap;
	
	public RunnableJob(URI uri, ConcurrentHashMap<String, StockLog> stocksMap){
		this.uri = uri;
		this.stocksMap = stocksMap;
	}
	
	public void run() {
		
		while(!stop){			
			// get data and put in ConcurrentHashMap
		}		
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}	
}
