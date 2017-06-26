package com.cache;

public class TestLRUCache {

	public static void main(String[] args) {
		
		LRUCache<Integer, String> cache = new LRUCache<Integer, String>(3);
		cache.put(1, "a");
		cache.put(2, "b");
		cache.put(3, "c");
		cache.put(4, "d");
		cache.printCache();

	}

}
