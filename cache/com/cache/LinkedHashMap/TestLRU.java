package com.cache.LinkedHashMap;


public class TestLRU {
	
	public static void main (String [] args){
		
		LRUCache<String, Integer> cache = new LRUCache<String, Integer>(3);
		cache.put("a", 1);
		cache.put("b", 2);
		cache.put("c", 3);
		cache.put("d", 4);
		
		
		System.out.println(cache.entrySet());
		
	}

}
