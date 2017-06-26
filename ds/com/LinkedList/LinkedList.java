package com.LinkedList;

// In LinkedList u start from Head

public class LinkedList<E>{
	private Node<E> head = null;
	private Node<E> tail = null;
	private Node<E> temp = null; 

	private int counter = 0;
	public LinkedList(){}
	public int size(){return counter;}
	
	
	public void add(E elem){
		   //if we don't have any elems in our LinkedList
		   if(head == null){ 
		         head = tail = new Node<E>();
				 head.elem = elem;
				 head.next = tail;
				 tail = head;
				 }
		   else{
				tail.next = new Node<E>(); //add a new node to the end of the list
				tail = tail.next; //set the tail pointer to that node
				tail.elem = elem; //set elem to be stored to the end node
				}	
		   counter++;
		}

	public void add(int index, E elem){

	/*If the user wants to add it to the end of the list call the other add() method, which is more efficient and then end this method*/
		  if(index == size()){
			add(elem);
			return;
			}

		  else if(index == 0){
		     Node<E> temp = new Node<E>();
		     temp.elem = elem;
		     temp.next = head;
		     head.previous = temp;
		     head = temp;
		     counter++;
		     return; 
		  }
		  /*Here, we start to see the temp node come into play. we use it to track the current node without modifying the head node.
		  */
		   temp = head;
		   for(int i = 0; i < index-1; i++) {
			   temp = temp.next; //move to the next node
		   }

		   Node<E> myNode = new Node<E>(); //create a new node
		   myNode.elem = elem;  //and set the elem
		   myNode.next = temp.next;  //set it to point to the next elem
		   temp.next = myNode;  //set the previous elem to point to it
		   counter++; //increment the count;

		}

	public E get(int index){
		   //forces the index to be valid
		  assert (index >= 0 && index < size());

		  temp = head; //start at the head of the list
		  
		  //iterate to the correct node
		  for(int i = 0; i < index; i++) temp = temp.next; 
		  return temp.elem; //and return the corresponding element

		}

	//returns first index of the given elem
	//returns -1 if elem not found
	public int get(E elem){ 
	   return indexOf(elem);
	}

	public int indexOf(E elem){
	   temp = head; //start at the beginning of the list
	   int i = 0; //create a counter field that isn't local to a loop

	  //while we haven't found the elem we are looking for, keep looking
	   for(; !(temp.elem).equals(elem) && temp != null; i++)
		  temp = temp.next;
	   if(i == size()) return -1; //if the elem wasn't found, return -1
	   return i;   //otherwise, return the index
		
	}


	
	
	
	
	
	
}


