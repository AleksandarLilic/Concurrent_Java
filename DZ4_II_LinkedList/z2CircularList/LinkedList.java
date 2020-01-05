package z2CircularList;

import z2CircularList.Node;

public class LinkedList<T> {
	
	private Node<T> head, tail;
	private int size;
	
	public LinkedList(){
		head = null;
		tail = null;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public void addHead(T e)
	{
		head = new Node<T>(e, null, head);
		if (tail == null)
			tail = head;
		size++;		
	}
	
	public void addTail(T e){
		Node<T> n = new Node<T>(e,tail,null);
		if (! isEmpty()){
			tail.setNext(n);
			tail = n;
		}
		else
		{
			head = n;
			tail = n;
		}
		size ++;
	}
	
	public T removeHead(){
		T i = head.getInfo();
		if (head == tail){ // if LL is empty set head and tail to null
			head = null;
			tail = null;
		}
		else {
			head=head.getNext(); // if LL is not empty, set head pointer to next node
			head.setPrevious(null); // set pointer to previous node to null
		}
		size --;
		return i;
	}
	public T removeTail(){
		T i = tail.getInfo();
		if (head == tail){ // if LL is empty set head and tail to null
			head = null;
			tail = null;
		}
		else{
			Node<T> rh = head;
			while (rh.getNext()!= tail)
				rh = rh.getNext();
			rh.setNext(null);
			tail=rh;
		}
		size--;
		return i;
	}
	public Node<T> getHead(){
		return head;
	}
	
	public Node<T> getTail(){
		return tail;
	}
	
	public String toString(){
		String s = "List: ";
		Node<T> n = head;
		while (n != null)
		{
			s = s + n.getInfo()+" ";
			n = n.getNext();
		}
		return s;
	}
	
}
