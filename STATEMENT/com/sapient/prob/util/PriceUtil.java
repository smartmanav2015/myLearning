package com.sapient.prob.util;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import com.sapient.prob.entity.Log;

public class PriceUtil {
	
	public static BigDecimal getPriceAverage(Collection<Log> c){
		
		BigDecimal totalPrice = null;
		for(Log log :c ){
			totalPrice = totalPrice.add(log.getPrice());
		}
		
		return totalPrice.divide(new BigDecimal(c.size()));
		
	}

}
