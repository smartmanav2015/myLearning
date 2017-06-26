package com.sapient.prob.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import com.sapient.prob.util.PriceUtil;

public class Client {

	public static void main(String[] args) {
		
		String source = "SOURCE";		
		
		ConcurrentHashMap<String, StockLog> stocksMap = new ConcurrentHashMap<String, StockLog>();
		
		StockLog stockLog = new StockLog();
		
		Log log1 = new Log(new BigDecimal(123.5));	
		stockLog.addtoCache(new Date(), log1);
		stockLog.setCurrentPrice(log1.getPrice());
		
		Log log2 = new Log(new BigDecimal(133.5));
		stockLog.addtoCache(new Date(), log2);
		stockLog.setCurrentPrice(log2.getPrice());
		
		// Calculate average price
		BigDecimal avgPrice = stockLog.calculateAveragePrice();
		
		stocksMap.put(source, stockLog);
		
		
	}

}
