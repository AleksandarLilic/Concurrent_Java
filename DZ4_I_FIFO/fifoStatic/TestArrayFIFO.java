package fifoStatic;

public class TestArrayFIFO {

	public static void main(String[] args) {
		
		ArrayFIFO array = new ArrayFIFO();
		System.out.println("FIFO elements" + array);
		array.insert(168.52);
		array.insert(37.123456);
		array.insert(19.01);
		System.out.println("FIFO with three added elements " + array);
		System.out.println("Number of elements: " + array.numberOfElements());
		System.out.println("Get: " + array.get());
		System.out.println("Get: " + array.get());
		System.out.println("Get: " + array.get());
		System.out.println("Get: " + array.get());
		System.out.println("Get: " + array.get());
		System.out.println("Get: " + array.get());
		array.insert(19.01);
		System.out.println("Get: " + array.get());

	}

}
