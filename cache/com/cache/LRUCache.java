package com.cache;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCache<Key, Value> {

	private final int maxSize;
	private ConcurrentHashMap<Key, Value> map;
	private LinkedList<Key> queue;

	public LRUCache(final int maxSize) {
		this.maxSize = maxSize;
		map = new ConcurrentHashMap<Key, Value>(maxSize);
		queue = new LinkedList<Key>();
	}

	/**
	 * @param key - may not be null!
	 * @param value - may not be null!
	 */
	public void put(final Key key, final Value value) {
		if (map.containsKey(key)) {
			queue.remove(key); // remove the key from the FIFO queue
		}

		while (queue.size() >= maxSize) { // while so that it works fine in multithread scenario
			Key oldestKey = queue.poll();
			if (null != oldestKey) {
				map.remove(oldestKey);
			}
		}
		queue.add(key);
		map.put(key, value);
	}

	/**
	 * @param key - may not be null!
	 * @return the value associated to the given key or null
	 */
	public Value get(final Key key) {
		return map.get(key);
	}
	
	public void printCache(){
		System.out.println(map.entrySet());
	}
	
}
