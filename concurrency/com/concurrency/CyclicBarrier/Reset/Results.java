package com.concurrency.CyclicBarrier.Reset;

public class Results implements Comparable<Result> {
	Long time;
	String site;

	Results(Long time, String site) {
		this.time = time;
		this.site = site;
	}

	public int compareTo(Result r) {
		return time.compareTo(r.time);
	}
}
