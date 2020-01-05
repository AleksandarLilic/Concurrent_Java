package z2CircularList;

public class Node<T> {
	
	private T info;
	private Node<T> previous;
	private Node<T> next;
	
	
	public Node()
	{
		previous = null;
		next = null;		
	}
	
	public Node (T i)
	{
		info = i;
		previous = null;
		next = null;
	}
	
	public Node (T i, Node<T> p, Node<T> n)
	{
		info = i;
		previous = p;
		next = n;
	}
	
	public void setInfo(T i)
	{
		info = i;
	}
	
	public void setPrevious(Node<T> p)
	{
		previous = p;
	}
	
	public void setNext(Node<T> n)
	{
		next = n;
	}
	
	public T getInfo(){
		return info;
	}
	
	public Node<T> getPrevious(){
		return previous;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public boolean isEqual(T i){
		return (i==info);
	}
	
	public String toString()
	{
		return ("Node info: "+ info);
	}
	

}
