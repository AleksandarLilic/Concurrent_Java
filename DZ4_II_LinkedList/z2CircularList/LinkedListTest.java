package z2CircularList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> list_int = new LinkedList<Integer>();
		list_int.addHead(6);
		list_int.addHead(11);
		list_int.addTail(25);
		list_int.addTail(2);
		System.out.println("Integer - Full " + list_int);
		list_int.removeHead();
		list_int.removeTail();
		System.out.println("Integer - Partial " + list_int);
		
		LinkedList<Double> list_db = new LinkedList<Double>();
		list_db.addHead(5.63);
		list_db.addHead(9.21);
		list_db.addTail(8.14);
		list_db.addTail(19.2);
		System.out.println("Double - Full " + list_db);
		list_db.removeHead();
		list_db.removeTail();
		System.out.println("Double - Partial " + list_db);
		
		LinkedList<String> list_s = new LinkedList<String>();
		list_s.addHead("s1");
		list_s.addHead("s12");
		list_s.addTail("s5");
		list_s.addTail("s52");
		System.out.println("String - Full " + list_s);
		list_s.removeHead();
		list_s.removeTail();
		System.out.println("String - Partial " + list_s);
	}

}
