package com.LinkedList;

public class LinkedListAPI<T> {
	
	private LinkedList<T> list;
	
	
	
	
	public void add(T t){
		if(list == null){
			list = new LinkedList<T>();
			list.setValue(t);
		}else{
			LinkedList<T> l = new LinkedList<T>();
			l.setValue(t);
			list.setNext(l);
			//list = l;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public class LinkedList<T> {
		
		
		private T value;
		
		private LinkedList<T> next;



		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public LinkedList<T> getNext() {
			return next;
		}

		public void setNext(LinkedList<T> next) {
			this.next = next;
		}

	
		
		

	}


}
